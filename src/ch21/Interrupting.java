/**
 * @Title Interrupting.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月11日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import java.io.*;
import static net.mindview.util.Print.*;

class SleepBlocked implements Runnable{
	public void run(){
		try{
			TimeUnit.SECONDS.sleep(100);
		}catch(InterruptedException e){
			print("InterruptedException");
		}
		print("Exiting SleepBlocked.run()");
	}
}

class IOBlocked implements Runnable{
	private InputStream in;
	public IOBlocked(InputStream in){ this.in = in; }
	public void run(){
		try{
			print("Waiting for read()");
			in.read();
		}catch(IOException e){
			if(Thread.currentThread().isInterrupted())
				print("Interrupted from blocked I/O");
			else
				throw new RuntimeException(e);
		}
		print("Exiting IOBlocked.run()");
	}
}

class SynchronizedBlocked implements Runnable{
	public synchronized void f(){
		while(true)// 一直不释放锁
			Thread.yield();
	}
	// 为了演示，必须首先获得锁。通过构造器中的匿名Thread来实现，这个匿名Thread类的对象通过调用f()获得对象锁
	// 这个线程必须有别于为SynchronizedBlock驱动run()的线程，因为一个线程可以多次获得某个对象锁
	public SynchronizedBlocked(){
		new Thread(){
			public void run(){
				f();
			}
		}.start();
	}
	public void run(){
		print("Trying to call f()");
		f();
		print("Exiting SynchronizedBlocked.run()");
	}
}

/**
 * @ClassName Interrupting
 * @Description 用Executor中断某个线程:
 * <p><li>SleepBlock可中断
 * <li>I/O不可中断
 * <li>synchronized不可中断
 * @author 吴扬颉
 * @date 2019年4月11日
 * 
 */
public class Interrupting {
	private static ExecutorService exec = Executors.newCachedThreadPool();
	static void test(Runnable r) throws InterruptedException{
		Future<?> f = exec.submit(r);
		TimeUnit.MICROSECONDS.sleep(100);
		print("Interrupting " + r.getClass().getName());
		f.cancel(true);
		print("Interrupt sent to " + r.getClass().getName());
	}
	public static void main(String[] args) throws Exception{
		test(new SleepBlocked());
		test(new IOBlocked(System.in));
		test(new SynchronizedBlocked());
		TimeUnit.SECONDS.sleep(3);
		print("Aborting with System.exit(0)");
		System.exit(0);
	}
}

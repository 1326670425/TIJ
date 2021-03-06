/**
 * @Title NotifyVsNotifyAll.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月12日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import java.util.*;

class Blocker{
	synchronized void waitingCall(){
		try{
			while(!Thread.interrupted()){
				wait();
				System.out.print(Thread.currentThread() + " ");
			}
		}catch(InterruptedException e){
			// OK to exit this way
		}
	}
	synchronized void prod(){ notify(); }
	synchronized void prodAll(){ notifyAll(); }
}

class Task implements Runnable{
	static Blocker blocker = new Blocker();
	public void run(){ blocker.waitingCall(); }
}

class Task2 implements Runnable{
	// A separate Blocker object;
	static Blocker blocker = new Blocker();
	public void run(){ blocker.waitingCall(); }
}


/**
 * @ClassName NotifyVsNotifyAll
 * @Description 当notifyAll()因某个特定锁而被调用时，只有等待这个锁的任务才会被唤醒
 * @author 吴扬颉
 * @date 2019年4月12日
 * 
 */
public class NotifyVsNotifyAll {
	public static void main(String[] args) throws Exception{
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++)
			exec.execute(new Task());
		exec.execute(new Task2());
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask(){
			boolean prod = true;
			public void run(){
				if(prod){
					System.out.print("\nnotify()");
					Task.blocker.prod();
					prod = false;
				}else{
					System.out.print("\nnotifyAll()");
					Task.blocker.prodAll();
					prod = true;
				}
			}
		}, 400, 400);
		TimeUnit.SECONDS.sleep(5);
		timer.cancel();
		System.out.println("\nTimer calceled");
		TimeUnit.MICROSECONDS.sleep(500);
		System.out.print("Task2.blocker.prodAll()");
		Task2.blocker.prodAll();
		TimeUnit.MICROSECONDS.sleep(500);
		System.out.println("\nShutting down");
		exec.shutdownNow();
	}
}

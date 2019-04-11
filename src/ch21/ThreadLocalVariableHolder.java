/**
 * @Title ThreadLocalVariableHolder.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月11日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import java.util.*;

class Accessor implements Runnable{
	private final int id;
	public Accessor(int id){ this.id = id; }
	public void run(){
		while(!Thread.currentThread().isInterrupted()){
			ThreadLocalVariableHolder.increment();
			System.out.println(this);
			Thread.yield();
		}
	}
	public String toString(){
		return "#" + id + ": " + ThreadLocalVariableHolder.get();
	}
}

/**
 * @ClassName ThreadLocalVariableHolder
 * @Description 线程本地存储
 * <p>防止任务在共享资源上产生冲突的第二种方式就是根除对变量的共享。线程本地存储是一种自动化机制，可以为使用相同变量的每个不同的线程都创建不同的存储。
 * 它们使得你可以将状态和线程关联起来
 * @author 吴扬颉
 * @date 2019年4月11日
 * 
 */
public class ThreadLocalVariableHolder {
	private static ThreadLocal<Integer> value = new ThreadLocal<Integer>(){
		private Random rand = new Random(47);
		protected synchronized Integer initialValue(){
			return rand.nextInt(10000);
		}
	};
	public static void increment(){
		value.set(value.get() + 1);
	}
	public static int get(){ return value.get(); }
	public static void main(String[] args) throws Exception{
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++)
			exec.execute(new Accessor(i));
		TimeUnit.SECONDS.sleep(3);
		exec.shutdownNow();
	}
}

/**
 * @Title SimplePriorities.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName SimplePriorities
 * @Description 线程优先级
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class SimplePriorities implements Runnable{
	private int countDown = 5;
	private volatile double d; // No optimization 努力确保不进行任何编译器优化
	private int priority;
	public SimplePriorities(int priority){
		this.priority = priority;
	}
	public String toString(){
		return Thread.currentThread() + ": " + countDown;
	}
	public void run(){
		Thread.currentThread().setPriority(priority);
		while(true){
			for(int i = 1; i < 100000; i++){
				d += (Math.PI + Math.E) / (double)i;
				if(i % 1000 == 0)
					Thread.yield();//让步只是一种暗示，没有任何机制会保证它被采纳
			}
			System.out.println(this);
			if(--countDown == 0)
				return;
		}
	}
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++)
			exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
		exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
		exec.shutdown();
	}
}

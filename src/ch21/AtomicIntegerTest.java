/**
 * @Title AtomicIntegerTest.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月11日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.*;
/**
 * @ClassName AtomicIntegerTest
 * @Description 原子类测试
 * @author 吴扬颉
 * @date 2019年4月11日
 * 
 */
public class AtomicIntegerTest implements Runnable{
	private AtomicInteger i = new AtomicInteger(0);
	public int getValue(){ return i.get(); }
	private void evenIncrement(){ i.addAndGet(2); }
	public void run(){
		while(true){
			evenIncrement();
		}
	}
	public static void main(String[] args) {
		new Timer().schedule(new TimerTask(){
			public void run(){
				System.err.println("Aborting");
				System.exit(0);
			}
		}, 5000); // Terminate after 5 seconds:五秒钟后终止
		ExecutorService exec = Executors.newCachedThreadPool();
		AtomicIntegerTest ait = new AtomicIntegerTest();
		exec.execute(ait);
		while(true){
			int val = ait.getValue();
			if(val % 2 != 0){
				System.out.println(val);
				System.exit(0);
			}
		}
		
	}
}

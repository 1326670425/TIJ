/**
 * @Title SleepingTask.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName SleepingTask
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class SleepingTask extends LiftOff{
	public void run(){
		try{
			while(countDown-- > 0){
				System.out.print(status());
				// 旧版本的方式
				// Thread.sleep(100);
				// 新版本方式
				TimeUnit.MICROSECONDS.sleep(100);
			}
		}catch(InterruptedException e){
			System.err.println("Interrupted");
		}
	}
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++)
			exec.execute(new SleepingTask());
		exec.shutdown();
	}
}

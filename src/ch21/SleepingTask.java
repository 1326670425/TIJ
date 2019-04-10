/**
 * @Title SleepingTask.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName SleepingTask
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class SleepingTask extends LiftOff{
	public void run(){
		try{
			while(countDown-- > 0){
				System.out.print(status());
				// �ɰ汾�ķ�ʽ
				// Thread.sleep(100);
				// �°汾��ʽ
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

/**
 * @Title DaemonFromFactory.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName DaemonFromFactory
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class DaemonFromFactory implements Runnable{
	public void run(){
		try{
			while(true){
				TimeUnit.MICROSECONDS.sleep(100);
				print(Thread.currentThread() + " " + this);
			}
		}catch(InterruptedException e){
			print("Interrupted");
		}
	}
	public static void main(String[] args) throws Exception{
		ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
		for(int i = 0; i < 10; i++)
			exec.execute(new DaemonFromFactory());
		print("All daemons started");
		TimeUnit.MICROSECONDS.sleep(500);
	}
}

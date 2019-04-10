/**
 * @Title SimpleDaemons.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName SimpleDaemons
 * @Description 后台线程：在程序运行的时候在后台提供的一种通用服务的线程，并且这种线程不属于程序中不可或缺的一部分。
 * 当所有的非后台线程结束时，程序也就终止了，同时会杀死进程中所有的后台线程。
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class SimpleDaemons implements Runnable{
	public void run(){
		try{
			while(true){
				TimeUnit.MICROSECONDS.sleep(100);
				print(Thread.currentThread() + " " + this);
			}
		}catch(InterruptedException e){
			print("sleep() interrupted");
		}
	}
	public static void main(String[] args) throws Exception{
		for(int i = 0; i < 10; i++){
			Thread daemon = new Thread(new SimpleDaemons());
			daemon.setDaemon(true);// 设置为后台线程
			daemon.start();
		}
		print("All daemons started");
		TimeUnit.MICROSECONDS.sleep(175);
	}
}

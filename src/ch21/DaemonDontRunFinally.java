/**
 * @Title DaemonDontRunFinally.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import static net.mindview.util.Print.*;

class ADaemon implements Runnable{
	public void run(){
		try{
			print("Starting ADaemon");
			TimeUnit.SECONDS.sleep(1);
		}catch(InterruptedException e){
			print("Exiting via InterruptedException");
		}finally{
			print("This should always run?");
		}
	}
}

/**
 * @ClassName DaemonDontRunFinally
 * @Description 后台线程在不执行finally子句的情况下就会终止run()方法。因为一旦main()方法退出，JVM就会立即关闭所有后台线程
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class DaemonDontRunFinally {
	public static void main(String[] args) throws Exception{
		Thread t = new Thread(new ADaemon());
		// 如果注释掉，finally将会执行
		t.setDaemon(true);
		t.start();
		TimeUnit.SECONDS.sleep(1);
	}
}

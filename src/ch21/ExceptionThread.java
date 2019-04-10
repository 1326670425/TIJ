/**
 * @Title ExceptionThread.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;

/**
 * @ClassName ExceptionThread
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class ExceptionThread implements Runnable{
	public void run(){
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new ExceptionThread());
	}
}

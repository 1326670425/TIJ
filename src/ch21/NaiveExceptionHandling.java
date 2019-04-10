/**
 * @Title NaiveExceptionHandling.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName NaiveExceptionHandling
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class NaiveExceptionHandling {
	public static void main(String[] args) {
		try{
			ExecutorService exec = Executors.newCachedThreadPool();
			exec.execute(new ExceptionThread());
		}catch(RuntimeException e){
			// 这条语句不会被执行
			System.out.println("Exception has been handled!");
		}
	}
}

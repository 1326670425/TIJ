/**
 * @Title NaiveExceptionHandling.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName NaiveExceptionHandling
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class NaiveExceptionHandling {
	public static void main(String[] args) {
		try{
			ExecutorService exec = Executors.newCachedThreadPool();
			exec.execute(new ExceptionThread());
		}catch(RuntimeException e){
			// ������䲻�ᱻִ��
			System.out.println("Exception has been handled!");
		}
	}
}

/**
 * @Title AtomicEvenGenerator.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月11日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.atomic.*;
/**
 * @ClassName AtomicEvenGenerator
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月11日
 * 
 */
public class AtomicEvenGenerator extends IntGenerator{
	private AtomicInteger currentEvenValue = new AtomicInteger(0);
	public int next(){
		return currentEvenValue.addAndGet(2);
	}
	public static void main(String[] args) {
		EvenChecker.test(new AtomicEvenGenerator());
	}
}

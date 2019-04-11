/**
 * @Title AtomicEvenGenerator.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��11��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.atomic.*;
/**
 * @ClassName AtomicEvenGenerator
 * @Description TODO
 * @author �����
 * @date 2019��4��11��
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

/**
 * @Title EvenGenerator.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;

/**
 * @ClassName EvenGenerator
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class EvenGenerator extends IntGenerator{
	private int currentEvenValue = 0;
	public int next(){
		++currentEvenValue;
		++currentEvenValue;
		return currentEvenValue;
	}
	public static void main(String[] args) {
		EvenChecker.test(new EvenGenerator());
	}
}

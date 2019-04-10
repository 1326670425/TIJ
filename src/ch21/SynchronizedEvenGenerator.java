/**
 * @Title SynchronizedEvenGenerator.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;

/**
 * @ClassName SynchronizedEvenGenerator
 * @Description ʹ��synchronized�ؼ��ֽ���ͬ������
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class SynchronizedEvenGenerator extends IntGenerator{
	private int currentEvenValue = 0;
	public synchronized int next(){
		++currentEvenValue;
		Thread.yield();
		++currentEvenValue;
		return currentEvenValue;
	}
	public static void main(String[] args) {
		EvenChecker.test(new SynchronizedEvenGenerator());
	}
}

/**
 * @Title SynchronizedEvenGenerator.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;

/**
 * @ClassName SynchronizedEvenGenerator
 * @Description 使用synchronized关键字进行同步控制
 * @author 吴扬颉
 * @date 2019年4月10日
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

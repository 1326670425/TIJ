/**
 * @Title MutexEvenGenerator.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.locks.*;
/**
 * @ClassName MutexEvenGenerator
 * @Description ��ʽ��
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class MutexEvenGenerator extends IntGenerator{
	private int currentEvenValue = 0;
	private Lock lock = new ReentrantLock();
	public int next(){
		lock.lock();
		try{
			++currentEvenValue;
			Thread.yield();
			++currentEvenValue;
			return currentEvenValue;
		}finally{
			lock.unlock();
		}
	}
	public static void main(String[] args) {
		EvenChecker.test(new MutexEvenGenerator());
	}
}

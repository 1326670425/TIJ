/**
 * @Title CachedThreadPool.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName CachedThreadPool
 * @Description ʹ��Executor����Thread����Executor�ڿͻ��˺�����֮���ṩ��һ���м��
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class CachedThreadPool {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		//shutdown()�ĵ��ÿ��Է�ֹ�������ύ�����Executor
		exec.shutdown();
	}
}

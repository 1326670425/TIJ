/**
 * @Title FixedThreadPool.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName FixedThreadPool
 * @Description FixedThreadPoolʹ�������޵��̼߳���ִ���ύ������
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class FixedThreadPool {
	public static void main(String[] args) {
		// ����Ϊ�߳�����
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for(int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	}
}

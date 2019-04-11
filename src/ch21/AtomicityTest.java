/**
 * @Title AtomicityTest.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName AtomicityTest
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class AtomicityTest implements Runnable{
	private int i = 0;
	public 
	// synchronized 
	int getValue(){ return i; }
	private synchronized void evenIncrement(){ i++; i++; }
	public void run(){
		while(true)
			evenIncrement();
	}
	// ����return i��ԭ�Ӳ���������ȱ��ͬ��ʹ������ֵ�����ڴ��ڲ��ȶ����м�״̬ʱ����ȡ������֮�⣬����iҲ����volatile�ģ���˻����ܴ��ڿ���������
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		AtomicityTest at = new AtomicityTest();
		exec.execute(at);
		while(true){
			int val = at.getValue();
			if(val % 2 != 0){
				System.out.println(val);
				System.exit(0);
			}
		}
	}
}

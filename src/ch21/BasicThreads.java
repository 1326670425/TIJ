/**
 * @Title BasicThreads.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;

/**
 * @ClassName BasicThreads
 * @Description Ҫʵ���߳���Ϊ��������ʽ�Ľ�һ�������ŵ��߳��ϣ��ύ��Thread������
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class BasicThreads {
	public static void main(String[] args) {
		Thread t = new Thread(new LiftOff());
		t.start();
		System.out.println("Waiting for LiftOff");
	}
}

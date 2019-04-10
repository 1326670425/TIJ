/**
 * @Title SelfManaged.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;

/**
 * @ClassName SelfManaged
 * @Description �ڹ������������߳̿��ܻ�������⣬��Ϊ��һ��������ܻ��ڹ���������ǰ��ʼִ�У�����ζ�Ÿ������ܹ����ʴ��ڲ��ȶ�״̬�Ķ���
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class SelfManaged implements Runnable {
	private int countDown = 5;
	private Thread t = new Thread(this);
	public SelfManaged(){ t.start(); }
	public String toString(){
		return Thread.currentThread().getName() + "(" + countDown + "), ";
	}
	public void run(){
		while(true){
			System.out.print(this);
			if(--countDown == 0)
				return;
		}
	}
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++)
			new SelfManaged();
	}
}

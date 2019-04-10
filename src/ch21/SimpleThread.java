/**
 * @Title SimpleThread.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;

/**
 * @ClassName SimpleThread
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class SimpleThread extends Thread{
	private int countDown = 5;
	private static int threadCount = 0;
	public SimpleThread(){
		// �洢�߳�����ΪthreadCount����ֵ
		super(Integer.toString(++threadCount));
		start();
	}
	public String toString(){
		// getName()��ȡ�߳�����
		return "#" + getName() + "(" + countDown + "), ";
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
			new SimpleThread();
	}
}

/**
 * @Title Chopstick.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��12��
 * @version 1.0
 */
package ch21;

/**
 * @ClassName Chopstick
 * @Description ��ѧ�ҾͲ�:����
 * @author �����
 * @date 2019��4��12��
 * 
 */
public class Chopstick {
	private boolean taken = false;
	public synchronized void take() throws InterruptedException{
		while(taken)
			wait();
		taken = true;
	}
	public synchronized void drop(){
		taken = false;
		notifyAll();
	}
}

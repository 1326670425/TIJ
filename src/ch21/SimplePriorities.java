/**
 * @Title SimplePriorities.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName SimplePriorities
 * @Description �߳����ȼ�
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class SimplePriorities implements Runnable{
	private int countDown = 5;
	private volatile double d; // No optimization Ŭ��ȷ���������κα������Ż�
	private int priority;
	public SimplePriorities(int priority){
		this.priority = priority;
	}
	public String toString(){
		return Thread.currentThread() + ": " + countDown;
	}
	public void run(){
		Thread.currentThread().setPriority(priority);
		while(true){
			for(int i = 1; i < 100000; i++){
				d += (Math.PI + Math.E) / (double)i;
				if(i % 1000 == 0)
					Thread.yield();//�ò�ֻ��һ�ְ�ʾ��û���κλ��ƻᱣ֤��������
			}
			System.out.println(this);
			if(--countDown == 0)
				return;
		}
	}
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++)
			exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
		exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
		exec.shutdown();
	}
}

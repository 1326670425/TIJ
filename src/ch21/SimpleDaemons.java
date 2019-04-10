/**
 * @Title SimpleDaemons.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName SimpleDaemons
 * @Description ��̨�̣߳��ڳ������е�ʱ���ں�̨�ṩ��һ��ͨ�÷�����̣߳����������̲߳����ڳ����в��ɻ�ȱ��һ���֡�
 * �����еķǺ�̨�߳̽���ʱ������Ҳ����ֹ�ˣ�ͬʱ��ɱ�����������еĺ�̨�̡߳�
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class SimpleDaemons implements Runnable{
	public void run(){
		try{
			while(true){
				TimeUnit.MICROSECONDS.sleep(100);
				print(Thread.currentThread() + " " + this);
			}
		}catch(InterruptedException e){
			print("sleep() interrupted");
		}
	}
	public static void main(String[] args) throws Exception{
		for(int i = 0; i < 10; i++){
			Thread daemon = new Thread(new SimpleDaemons());
			daemon.setDaemon(true);// ����Ϊ��̨�߳�
			daemon.start();
		}
		print("All daemons started");
		TimeUnit.MICROSECONDS.sleep(175);
	}
}

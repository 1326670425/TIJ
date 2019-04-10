/**
 * @Title DaemonDontRunFinally.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import static net.mindview.util.Print.*;

class ADaemon implements Runnable{
	public void run(){
		try{
			print("Starting ADaemon");
			TimeUnit.SECONDS.sleep(1);
		}catch(InterruptedException e){
			print("Exiting via InterruptedException");
		}finally{
			print("This should always run?");
		}
	}
}

/**
 * @ClassName DaemonDontRunFinally
 * @Description ��̨�߳��ڲ�ִ��finally�Ӿ������¾ͻ���ֹrun()��������Ϊһ��main()�����˳���JVM�ͻ������ر����к�̨�߳�
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class DaemonDontRunFinally {
	public static void main(String[] args) throws Exception{
		Thread t = new Thread(new ADaemon());
		// ���ע�͵���finally����ִ��
		t.setDaemon(true);
		t.start();
		TimeUnit.SECONDS.sleep(1);
	}
}

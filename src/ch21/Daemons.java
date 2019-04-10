/**
 * @Title Daemons.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import static net.mindview.util.Print.*;

class Daemon implements Runnable{
	private Thread[] t = new Thread[10];
	public void run(){
		for(int i = 0; i < t.length; i++){
			t[i] = new Thread(new DaemonSpawn());
			t[i].start();
			printnb("DaemonSpawn " + i + " started, ");
		}
		for(int i = 0; i < t.length; i++)
			printnb("t[" + i + "].isDaemon() = " + t[i].isDaemon() + ", ");
		while(true)
			Thread.yield();
	}
}

class DaemonSpawn implements Runnable{
	public void run(){
		while(true)
			Thread.yield();
	}
}


/**
 * @ClassName Daemons
 * @Description ���һ���߳��Ǻ�̨�̣߳���ô���������κ��̶߳��Զ�������Ϊ��̨�߳�
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class Daemons {
	public static void main(String[] args) throws Exception{
		Thread d = new Thread(new Daemon());
		d.setDaemon(true);
		d.start();
		printnb("d.isDaemon() = " + d.isDaemon() + ", ");
		// Allow the daemon thread to
		// finish their startup processes
		TimeUnit.SECONDS.sleep(1);
	}
}

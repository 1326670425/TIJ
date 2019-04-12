/**
 * @Title Interrupting2.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��11��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
import static net.mindview.util.Print.*;

class BlockedMutex {
	  private Lock lock = new ReentrantLock();
	  public BlockedMutex() {
	    // Acquire it right away, to demonstrate interruption
	    // of a task blocked on a ReentrantLock:
	    lock.lock();
	  }
	  // ��������ʱ����ȡ���������Lock�����Ҳ��ͷš������ͼ�ӵڶ��������е���f()(��ͬ�ڴ���������������)����������
	  public void f() {
	    try {
	      // This will never be available to a second task
	      lock.lockInterruptibly(); // Special call
	      print("lock acquired in f()");
	    } catch(InterruptedException e) {
	      print("Interrupted from lock acquisition in f()");
	    }
	  }
}

class Blocked2 implements Runnable {
	  BlockedMutex blocked = new BlockedMutex();
	  public void run() {
	    print("Waiting for f() in BlockedMutex");
	    blocked.f();
	    print("Broken out of blocked call");
	  }
}

/**
 * @ClassName Interrupting2
 * @Description ��RenntrantLock������������߱����Ա��жϵ�������
 * @author �����
 * @date 2019��4��11��
 * 
 */
public class Interrupting2 {
	  public static void main(String[] args) throws Exception {
		    Thread t = new Thread(new Blocked2());
		    t.start();
		    TimeUnit.SECONDS.sleep(1);
		    System.out.println("Issuing t.interrupt()");
		    t.interrupt();
		  }
}

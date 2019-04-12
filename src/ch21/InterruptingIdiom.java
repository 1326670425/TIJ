/**
 * @Title InterruptingIdiom.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��11��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import static net.mindview.util.Print.*;

class NeedsCleanup {
	  private final int id;
	  public NeedsCleanup(int ident) {
	    id = ident;
	    print("NeedsCleanup " + id);
	  }
	  public void cleanup() {
	    print("Cleaning up " + id);
	  }
}

class Blocked3 implements Runnable {
	  private volatile double d = 0.0;
	  // ���interrupt()��ע��point2֮�󣨼��ڷ������Ĳ��������У������ã�name����ѭ��������Ȼ�����б��ض������٣�
	  // ���ѭ������while���Ķ����˳����������interrupt()��point1��point2֮�䣨��while���֮�󣬵�������������sleep()֮ǰ������У�
	  // �����ã���ô�������ͻ��ڵ�һ����ͼ������������֮ǰ������InterruptedException�˳���
	  public void run() {
	    try {
	      while(!Thread.interrupted()) {
	        // point1
	        NeedsCleanup n1 = new NeedsCleanup(1);
	        // Start try-finally immediately after definition
	        // of n1, to guarantee proper cleanup of n1:
	        try {
	          print("Sleeping");
	          TimeUnit.SECONDS.sleep(1);
	          // point2
	          NeedsCleanup n2 = new NeedsCleanup(2);
	          // Guarantee proper cleanup of n2:
	          try {
	            print("Calculating");
	            // A time-consuming, non-blocking operation:
	            for(int i = 1; i < 250000000; i++)
	              d = d + (Math.PI + Math.E) / d;
	            print("Finished time-consuming operation");
	          } finally {
	            n2.cleanup();
	          }
	        } finally {
	          n1.cleanup();
	        }
	      }
	      print("Exiting via while() test");
	    } catch(InterruptedException e) {
	      print("Exiting via InterruptedException");
	    }
	  }
}

/**
 * @ClassName InterruptingIdiom
 * @Description ����ж�
 * @author �����
 * @date 2019��4��11��
 * 
 */
public class InterruptingIdiom {
	  public static void main(String[] args) throws Exception {
/*		    if(args.length != 1) {
		      print("usage: java InterruptingIdiom delay-in-mS");
		      System.exit(1);
		    }*/
		    Thread t = new Thread(new Blocked3());
		    t.start();
		    TimeUnit.MILLISECONDS.sleep(2000);
		    t.interrupt();
		  }
}

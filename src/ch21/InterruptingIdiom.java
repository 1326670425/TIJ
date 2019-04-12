/**
 * @Title InterruptingIdiom.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月11日
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
	  // 如果interrupt()在注释point2之后（即在非阻塞的操作过程中）被调用，name首先循环结束，然后所有本地对象被销毁，
	  // 最后循环经由while语句的顶部退出。但是如果interrupt()在point1和point2之间（在while语句之后，但是在阻塞操作sleep()之前或过程中）
	  // 被调用，那么这个任务就会在第一次试图调用阻塞操作之前，经由InterruptedException退出。
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
 * @Description 检查中断
 * @author 吴扬颉
 * @date 2019年4月11日
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

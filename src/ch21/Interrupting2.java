/**
 * @Title Interrupting2.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月11日
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
	  // 创建对象时，获取对象自身的Lock，并且不释放。如果试图从第二个任务中调用f()(不同于创建这个对象的任务)，将会阻塞
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
 * @Description 在RenntrantLock上阻塞的任务具备可以被中断的能力。
 * @author 吴扬颉
 * @date 2019年4月11日
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

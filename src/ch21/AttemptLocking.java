/**
 * @Title AttemptLocking.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
/**
 * @ClassName AttemptLocking
 * @Description 适合使用显式锁的情况：用synchronized关键字不能尝试着获取锁且最终获取锁会失败，
 * 或者尝试着获取锁一段时间后，然后放弃它。
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class AttemptLocking {
	  private ReentrantLock lock = new ReentrantLock();
	  public void untimed() {
	    boolean captured = lock.tryLock();
	    try {
	      System.out.println("tryLock(): " + captured);
	    } finally {
	      if(captured)
	        lock.unlock();
	    }
	  }
	  public void timed() {
	    boolean captured = false;
	    try {
	      captured = lock.tryLock(2, TimeUnit.SECONDS);
	    } catch(InterruptedException e) {
	      throw new RuntimeException(e);
	    }
	    try {
	      System.out.println("tryLock(2, TimeUnit.SECONDS): " +
	        captured);
	    } finally {
	      if(captured)
	        lock.unlock();
	    }
	  }
	  public static void main(String[] args) throws Exception{
	    final AttemptLocking al = new AttemptLocking();
	    al.untimed(); // True -- lock is available
	    al.timed();   // True -- lock is available
	    // Now create a separate task to grab the lock:
	    new Thread() {
	      { setDaemon(true); }
	      public void run() {
	        al.lock.lock();
	        System.out.println("acquired");
	      }
	    }.start();
	    TimeUnit.SECONDS.sleep(1);
	    // Thread.yield(); // Give the 2nd task a chance
	    al.untimed(); // False -- lock grabbed by task
	    al.timed();   // False -- lock grabbed by task
	  }
}

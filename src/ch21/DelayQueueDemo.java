/**
 * @Title DelayQueueDemo.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月13日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import java.util.*;
import static java.util.concurrent.TimeUnit.*;
import static net.mindview.util.Print.*;

class DelayedTask implements Runnable, Delayed {
	  private static int counter = 0;
	  private final int id = counter++;
	  private final int delta;
	  private final long trigger;
	  protected static List<DelayedTask> sequence =
	    new ArrayList<DelayedTask>();
	  public DelayedTask(int delayInMilliseconds) {
	    delta = delayInMilliseconds;
	    // 当前时间+延迟时间=触发时间，也即到期时间
	    trigger = System.nanoTime() +
	      NANOSECONDS.convert(delta, MILLISECONDS);
	    sequence.add(this);
	  }
	  public long getDelay(TimeUnit unit) {
	    return unit.convert(
	      trigger - System.nanoTime(), NANOSECONDS);
	  }
	  public int compareTo(Delayed arg) {
	    DelayedTask that = (DelayedTask)arg;
	    if(trigger < that.trigger) return -1;
	    if(trigger > that.trigger) return 1;
	    return 0;
	  }
	  public void run() { printnb(this + " "); }
	  public String toString() {
	    return String.format("[%1$-4d]", delta) +
	      " Task " + id;
	  }
	  public String summary() {
	    return "(" + id + ":" + delta + ")";
	  }
	  // 结束哨兵，提供一种关闭所有事物的途径：将其放置为队列最后一个元素
	  public static class EndSentinel extends DelayedTask {
	    private ExecutorService exec;
	    public EndSentinel(int delay, ExecutorService e) {
	      super(delay);
	      exec = e;
	    }
	    public void run() {
	      for(DelayedTask pt : sequence) {
	        printnb(pt.summary() + " ");
	      }
	      print();
	      print(this + " Calling shutdownNow()");
	      exec.shutdownNow();
	    }
	  }
}

class DelayedTaskConsumer implements Runnable {
	  private DelayQueue<DelayedTask> q;
	  public DelayedTaskConsumer(DelayQueue<DelayedTask> q) {
	    this.q = q;
	  }
	  public void run() {
	    try {
	      while(!Thread.interrupted())
	        q.take().run(); // Run task with the current thread
	    } catch(InterruptedException e) {
	      // Acceptable way to exit
	    }
	    print("Finished DelayedTaskConsumer");
	  }
	}



/**
 * @ClassName DelayQueueDemo
 * @Description 无界的BlockingQueue，用于放置实现了Delayed接口的对象，其中对象只能在其到期时才能从队列中取走。
 * 这种队列是有序的，对头对象的延迟到期时间最长。如果没有任何延迟到期，那么就不会有头元素，并且poll()返回null（所以不能向其中放入null）
 * <p>任务创建的顺序对执行顺序没有影响，任务是按照期望的延迟顺序执行的。
 * @author 吴扬颉
 * @date 2019年4月13日
 * 
 */
public class DelayQueueDemo {
	  public static void main(String[] args) {
		    Random rand = new Random(47);
		    ExecutorService exec = Executors.newCachedThreadPool();
		    DelayQueue<DelayedTask> queue =
		      new DelayQueue<DelayedTask>();
		    // Fill with tasks that have random delays:
		    for(int i = 0; i < 20; i++)
		      queue.put(new DelayedTask(rand.nextInt(5000)));
		    // Set the stopping point
		    queue.add(new DelayedTask.EndSentinel(5000, exec));
		    exec.execute(new DelayedTaskConsumer(queue));
		  }
}

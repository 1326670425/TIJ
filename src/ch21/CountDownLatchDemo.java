/**
 * @Title CountDownLatchDemo.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月12日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import java.util.*;
import static net.mindview.util.Print.*;

//Performs some portion of a task:
class TaskPortion implements Runnable {
	private static int counter = 0;
	private final int id = counter++;
	private static Random rand = new Random(47);
	private final CountDownLatch latch;
	TaskPortion(CountDownLatch latch) {
	 this.latch = latch;
	}
	public void run() {
	 try {
	   doWork();
	   latch.countDown();
	 } catch(InterruptedException ex) {
	   // Acceptable way to exit
	 }
	}
	public void doWork() throws InterruptedException {
	 TimeUnit.MILLISECONDS.sleep(rand.nextInt(2000));
	 print(this + "completed");
	}
	public String toString() {
	 return String.format("%1$-3d ", id);
	}
}

//Waits on the CountDownLatch:
class WaitingTask implements Runnable {
	private static int counter = 0;
	private final int id = counter++;
	private final CountDownLatch latch;
	WaitingTask(CountDownLatch latch) {
	 this.latch = latch;
	}
	public void run() {
	 try {
	   latch.await();
	   print("Latch barrier passed for " + this);
	 } catch(InterruptedException ex) {
	   print(this + " interrupted");
	 }
	}
	public String toString() {
	 return String.format("WaitingTask %1$-3d ", id);
	}
}


/**
 * @ClassName CountDownLatchDemo
 * @Description CountDownLatch示例：它被用来同步一个或多个任务，强制它们等待由其他任务执行的一组操作完成。可以向CountDownLatch
 * 对象设置一个初始计数值，任何在这个对象上调用wait()方法都将阻塞，直到这个计数器为0,。其它任务结束工作后，可以在该对象上调用countDown()来
 * 减小这个数值。CountDownLatch被设计为只触发一次，计数值不能被重置，如果想重置，可以用CyclicBarrier
 * <p>CountDownLatch的典型用法是将一个程序分为n个互相独立的可解决任务，并创建值为0的CountDownLatch。当每个任务完成时，都会在这个锁存器上调用countDown().
 * 等待问题被解决的任务在这个锁存器上调用await()，将它们自己拦住，直到锁存器计数结束
 * @author 吴扬颉
 * @date 2019年4月12日
 * 
 */
public class CountDownLatchDemo {
	  static final int SIZE = 100;
	  public static void main(String[] args) throws Exception {
	    ExecutorService exec = Executors.newCachedThreadPool();
	    // All must share a single CountDownLatch object:
	    CountDownLatch latch = new CountDownLatch(SIZE);
	    for(int i = 0; i < 10; i++)
	      exec.execute(new WaitingTask(latch));
	    for(int i = 0; i < SIZE; i++)
	      exec.execute(new TaskPortion(latch));
	    print("Launched all tasks");
	    exec.shutdown(); // Quit when all tasks complete
	  }
}

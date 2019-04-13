/**
 * @Title CountDownLatchDemo.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��12��
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
 * @Description CountDownLatchʾ������������ͬ��һ����������ǿ�����ǵȴ�����������ִ�е�һ�������ɡ�������CountDownLatch
 * ��������һ����ʼ����ֵ���κ�����������ϵ���wait()��������������ֱ�����������Ϊ0,������������������󣬿����ڸö����ϵ���countDown()��
 * ��С�����ֵ��CountDownLatch�����Ϊֻ����һ�Σ�����ֵ���ܱ����ã���������ã�������CyclicBarrier
 * <p>CountDownLatch�ĵ����÷��ǽ�һ�������Ϊn����������Ŀɽ�����񣬲�����ֵΪ0��CountDownLatch����ÿ���������ʱ������������������ϵ���countDown().
 * �ȴ����ⱻ���������������������ϵ���await()���������Լ���ס��ֱ����������������
 * @author �����
 * @date 2019��4��12��
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

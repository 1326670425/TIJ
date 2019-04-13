/**
 * @Title ActiveObjectDemo.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月13日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import java.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName ActiveObjectDemo
 * @Description 活动对象。每个对象都维护着自己的工作器线程和消息队列，所有对这种对象的请求都将进入队列排队，
 * 任何时刻都只能运行一个。有了活动对象，我们可以串行化消息而不是方法。
 * <p>当向一个活动对象发送消息时，这条消息会转变为一个任务，该任务被插入到对象的队列中，等待以后某个时刻运行。
 * @author 吴扬颉
 * @date 2019年4月13日
 * 
 */
public class ActiveObjectDemo {
	  private ExecutorService ex =
			    Executors.newSingleThreadExecutor();
			  private Random rand = new Random(47);
			  // Insert a random delay to produce the effect
			  // of a calculation time:
			  private void pause(int factor) {
			    try {
			      TimeUnit.MILLISECONDS.sleep(
			        100 + rand.nextInt(factor));
			    } catch(InterruptedException e) {
			      print("sleep() interrupted");
			    }
			  }
			  // 每个活动对象方法的返回值都是一个具有泛型类型的Future，而这个泛型参数就是该方法中实际的返回类型
			  public Future<Integer>
			  calculateInt(final int x, final int y) {
			    return ex.submit(new Callable<Integer>() {
			      public Integer call() {
			        print("starting " + x + " + " + y);
			        pause(500);
			        return x + y;
			      }
			    });
			  }
			  public Future<Float>
			  calculateFloat(final float x, final float y) {
			    return ex.submit(new Callable<Float>() {
			      public Float call() {
			        print("starting " + x + " + " + y);
			        pause(2000);
			        return x + y;
			      }
			    });
			  }
			  public void shutdown() { ex.shutdown(); }
			  public static void main(String[] args) {
			    ActiveObjectDemo d1 = new ActiveObjectDemo();
			    // Prevents ConcurrentModificationException:
			    List<Future<?>> results =
			      new CopyOnWriteArrayList<Future<?>>();
			    for(float f = 0.0f; f < 1.0f; f += 0.2f)
			      results.add(d1.calculateFloat(f, f));
			    for(int i = 0; i < 5; i++)
			      results.add(d1.calculateInt(i, i));
			    print("All asynch calls made");
			    while(results.size() > 0) {
			      for(Future<?> f : results)
			        if(f.isDone()) {
			          try {
			            print(f.get());
			          } catch(Exception e) {
			            throw new RuntimeException(e);
			          }
			          results.remove(f);
			        }
			    }
			    d1.shutdown();
			  }
}

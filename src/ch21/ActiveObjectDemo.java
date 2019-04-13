/**
 * @Title ActiveObjectDemo.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��13��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import java.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName ActiveObjectDemo
 * @Description �����ÿ������ά�����Լ��Ĺ������̺߳���Ϣ���У����ж����ֶ�������󶼽���������Ŷӣ�
 * �κ�ʱ�̶�ֻ������һ�������˻�������ǿ��Դ��л���Ϣ�����Ƿ�����
 * <p>����һ�����������Ϣʱ��������Ϣ��ת��Ϊһ�����񣬸����񱻲��뵽����Ķ����У��ȴ��Ժ�ĳ��ʱ�����С�
 * @author �����
 * @date 2019��4��13��
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
			  // ÿ������󷽷��ķ���ֵ����һ�����з������͵�Future����������Ͳ������Ǹ÷�����ʵ�ʵķ�������
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

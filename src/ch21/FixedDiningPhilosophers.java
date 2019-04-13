/**
 * @Title FixedDiningPhilosophers.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月12日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName FixedDiningPhilosophers
 * @Description 破坏死锁发生条件（循环等待）
 * @author 吴扬颉
 * @date 2019年4月12日
 * 
 */
public class FixedDiningPhilosophers {
	  public static void main(String[] args) throws Exception {
		    int ponder = 5;
		    if(args.length > 0)
		      ponder = Integer.parseInt(args[0]);
		    int size = 5;
		    if(args.length > 1)
		      size = Integer.parseInt(args[1]);
		    ExecutorService exec = Executors.newCachedThreadPool();
		    Chopstick[] sticks = new Chopstick[size];
		    for(int i = 0; i < size; i++)
		      sticks[i] = new Chopstick();
		    for(int i = 0; i < size; i++)
		      if(i < (size-1))
		        exec.execute(new Philosopher(
		          sticks[i], sticks[i+1], i, ponder));
		      else
		        exec.execute(new Philosopher(
		          sticks[0], sticks[i], i, ponder));// 其他哲学家先右后左，最后一个哲学家先左后右
		    if(args.length == 3 && args[2].equals("timeout"))
		      TimeUnit.SECONDS.sleep(5);
		    else {
		      System.out.println("Press 'Enter' to quit");
		      System.in.read();
		    }
		    exec.shutdownNow();
		  }
}

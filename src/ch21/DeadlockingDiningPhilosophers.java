/**
 * @Title DeadlockingDiningPhilosophers.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月12日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName DeadlockingDiningPhilosophers
 * @Description 死锁：哲学家就餐问题。
 * <p>死锁发生的四个条件：
 * <li>互斥条件。任务使用的资源至少有一个是不能共享的
 * <li>至少有一个任务，它必须持有一个资源且正在等待获取一个被别的任务持有的资源
 * <li>资源不能被任务抢占
 * <li>循环等待
 * @author 吴扬颉
 * @date 2019年4月12日
 * 
 */
public class DeadlockingDiningPhilosophers {
	public static void main(String[] args) throws Exception{
		// 思考时间
		int ponder = 5;
		if(args.length > 1)
			ponder =  Integer.parseInt(args[0]);
		int size = 5;
		if(args.length > 1)
			size = Integer.parseInt(args[1]);
		ExecutorService exec = Executors.newCachedThreadPool();
		Chopstick[] sticks = new Chopstick[size];
		for(int i = 0; i < size; i++)
			sticks[i] = new Chopstick();
		for(int i = 0; i < size; i++)
			exec.execute(new Philosopher(sticks[i], sticks[(i + 1) % size], i, ponder));
		if(args.length == 3 && args[2].equals("timeout"))
			TimeUnit.SECONDS.sleep(5);
		else{
			System.out.println("Press 'Enter' to quit");
			System.in.read();
		}
		exec.shutdownNow
		();
	}
}

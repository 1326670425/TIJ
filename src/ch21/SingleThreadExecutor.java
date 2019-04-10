/**
 * @Title SingleThreadExecutor.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName SingleThreadExecutor
 * @Description SingleThreadExecutor就像线程数为1的FixedThreadPool，这对于希望在另一个线程中连续运行的任何事物都是有用的。
 * 它还提供了一种重要的并发保证，其它线程不会被并发调用，这会改变任务的加锁需求
 * 如果向SingleThreadExecutor提交了多个任务，那么这些任务将顺序执行。
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class SingleThreadExecutor {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for(int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	}
}

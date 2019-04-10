/**
 * @Title CachedThreadPool.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName CachedThreadPool
 * @Description 使用Executor管理Thread对象，Executor在客户端和任务之间提供了一个中间层
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class CachedThreadPool {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		//shutdown()的调用可以防止新任务被提交到这个Executor
		exec.shutdown();
	}
}

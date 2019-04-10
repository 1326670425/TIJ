/**
 * @Title FixedThreadPool.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName FixedThreadPool
 * @Description FixedThreadPool使用了有限的线程集来执行提交的任务
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class FixedThreadPool {
	public static void main(String[] args) {
		// 参数为线程数量
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for(int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	}
}

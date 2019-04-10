/**
 * @Title SettingDefaultHandler.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName SettingDefaultHandler
 * @Description 如果处处用到相同的异常处理器，那么可以在Thread中设置一个静态域，并将这个处理器设为默认的未捕获异常处理器。
 * <p>这个处理器只有在不存在线程专用的未捕获异常处理器的情况下才会被调用。系统会检查线程专有版本，如果没有发现，则检查线程组是否具有专有的
 * uncaughtException()方法，如果也没有，才会调用defaultUncaughtExceptionHandler。
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class SettingDefaultHandler {
	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler(
				new MyUncaughtExceptionHandler());
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new ExceptionThread());
	}
}

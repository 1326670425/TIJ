/**
 * @Title CloseResource.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月11日
 * @version 1.0
 */
package ch21;
import java.net.*;
import java.util.concurrent.*;
import java.io.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName CloseResource
 * @Description 关闭任务在其上发生阻塞的底层资源，以中断那些不可中断的线程（如I/O操作）
 * @author 吴扬颉
 * @date 2019年4月11日
 * 
 */
public class CloseResource {
	  public static void main(String[] args) throws Exception {
		    ExecutorService exec = Executors.newCachedThreadPool();
		    ServerSocket server = new ServerSocket(8080);
		    InputStream socketInput =
		      new Socket("localhost", 8080).getInputStream();
		    exec.execute(new IOBlocked(socketInput));
		    exec.execute(new IOBlocked(System.in));
		    TimeUnit.MILLISECONDS.sleep(100);
		    print("Shutting down all threads");
		    exec.shutdownNow();
		    TimeUnit.SECONDS.sleep(1);
		    print("Closing " + socketInput.getClass().getName());
		    socketInput.close(); // Releases blocked thread
		    TimeUnit.SECONDS.sleep(1);
		    print("Closing " + System.in.getClass().getName());
		    System.in.close(); // Releases blocked thread
	  }
}

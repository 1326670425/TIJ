/**
 * @Title CloseResource.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��11��
 * @version 1.0
 */
package ch21;
import java.net.*;
import java.util.concurrent.*;
import java.io.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName CloseResource
 * @Description �ر����������Ϸ��������ĵײ���Դ�����ж���Щ�����жϵ��̣߳���I/O������
 * @author �����
 * @date 2019��4��11��
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

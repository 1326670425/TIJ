/**
 * @Title NIOInterruption.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月11日
 * @version 1.0
 */
package ch21;
import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.concurrent.*;
import java.io.*;
import static net.mindview.util.Print.*;

class NIOBlocked implements Runnable {
	  private final SocketChannel sc;
	  public NIOBlocked(SocketChannel sc) { this.sc = sc; }
	  public void run() {
	    try {
	      print("Waiting for read() in " + this);
	      sc.read(ByteBuffer.allocate(1));
	    } catch(ClosedByInterruptException e) {
	      print("ClosedByInterruptException");
	    } catch(AsynchronousCloseException e) {
	      print("AsynchronousCloseException");
	    } catch(IOException e) {
	      throw new RuntimeException(e);
	    }
	    print("Exiting NIOBlocked.run() " + this);
	  }
}

/**
 * @ClassName NIOInterruption
 * @Description nio更人性化的I/O中断
 * @author 吴扬颉
 * @date 2019年4月11日
 * 
 */
public class NIOInterruption {
	  public static void main(String[] args) throws Exception {
		    ExecutorService exec = Executors.newCachedThreadPool();
		    ServerSocket server = new ServerSocket(8080);
		    InetSocketAddress isa =
		      new InetSocketAddress("localhost", 8080);
		    SocketChannel sc1 = SocketChannel.open(isa);
		    SocketChannel sc2 = SocketChannel.open(isa);
		    Future<?> f = exec.submit(new NIOBlocked(sc1));
		    exec.execute(new NIOBlocked(sc2));
		    exec.shutdown();
		    TimeUnit.SECONDS.sleep(1);
		    // Produce an interrupt via cancel:
		    f.cancel(true);
		    TimeUnit.SECONDS.sleep(1);
		    // Release the block by closing the channel:
		    sc2.close();
		  }
}

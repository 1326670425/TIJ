/**
 * @Title PipedIO.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月12日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import java.io.*;
import java.util.*;
import static net.mindview.util.Print.*;

class Sender implements Runnable{
	private Random rand = new Random(47);
	private PipedWriter out = new PipedWriter();
	public PipedWriter getPipedWriter(){ return out; }
	public void run(){
		try{
			while(true){
				for(char c = 'A'; c <= 'z'; c++){
					out.write(c);
					TimeUnit.MICROSECONDS.sleep(rand.nextInt(500));
					// TimeUnit.SECONDS.sleep(1);
				}
			}
		}catch(IOException e){
			print(e + " Sender write exception");
		}catch(InterruptedException e){
			print(e + " Sender sleep interrupted");
		}
	}
}

class Receiver implements Runnable{
	private PipedReader in;
	public Receiver(Sender sender) throws IOException{
		in = new PipedReader(sender.getPipedWriter());
	}
	public void run(){
		try{
			while(true){
				// 阻塞，直到有字符出现
				printnb("Read: " + (char)in.read() + ", ");
			}
		}catch(IOException e){
			print(e + " Receiver read exception");
		}
	}
}


/**
 * @ClassName PipedIO
 * @Description 使用管道通信
 * @author 吴扬颉
 * @date 2019年4月12日
 * 
 */
public class PipedIO {
	public static void main(String[] args) throws Exception{
		Sender sender = new Sender();
		Receiver receiver = new Receiver(sender);
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(sender);
		exec.execute(receiver);
		TimeUnit.SECONDS.sleep(4);
		exec.shutdownNow();
	}
}

/**
 * @Title Joining.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;
import static net.mindview.util.Print.*;

class Sleeper extends Thread{
	private int duration;
	public Sleeper(String name, int sleepTime){
		super(name);
		duration = sleepTime;
		start();
	}
	public void run(){
		try{
			sleep(duration);
		}catch(InterruptedException e){
			// 异常被捕获时将清理这个标志，所以在catch语句中，在异常被捕获的时候这个标志总是为假
			print(getName() + " was interrupted. " + "isInterrupted(): " + isInterrupted());
			return;
		}
		print(getName() + " has awakened");
	}
}

class Joiner extends Thread{
	private Sleeper sleeper;
	public Joiner(String name, Sleeper sleeper){
		super(name);
		this.sleeper = sleeper;
		start();
	}
	public void run(){
		try{
			sleeper.join();
		}catch(InterruptedException e){
			print("Interrupted");
		}
		print(getName() + " join completed");
	}
}


/**
 * @ClassName Joining
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class Joining {
	public static void main(String[] args) {
		Sleeper sleepy = new Sleeper("Sleepy", 1500);
		Sleeper grumpy = new Sleeper("Grumpy", 1500);
		Joiner dopey = new Joiner("Dopey", sleepy),
				doc = new Joiner("Doc", grumpy);
		grumpy.interrupt();
	}
}

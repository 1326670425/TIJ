/**
 * @Title Joining.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
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
			// �쳣������ʱ�����������־��������catch����У����쳣�������ʱ�������־����Ϊ��
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
 * @author �����
 * @date 2019��4��10��
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

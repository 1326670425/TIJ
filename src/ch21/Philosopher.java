/**
 * @Title Philosopher.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月12日
 * @version 1.0
 */
package ch21;
import java.util.*;
import java.util.concurrent.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName Philosopher
 * @Description 哲学家就餐：哲学家
 * @author 吴扬颉
 * @date 2019年4月12日
 * 
 */
public class Philosopher implements Runnable {
	private Chopstick left;
	private Chopstick right;
	private final int id;
	private final int ponderFactor;
	private Random rand = new Random(47);
	private void pause() throws InterruptedException{
		if(ponderFactor == 0)
			return;
		TimeUnit.MICROSECONDS.sleep(rand.nextInt(ponderFactor * 250));
	}
	public Philosopher(Chopstick left, Chopstick right, int ident, int ponder){
		this.left = left;
		this.right = right;
		id = ident;
		ponderFactor = ponder;
	}
	public void run(){
		try{
			while(!Thread.interrupted()){
				print(this + " " + "thinking");
				pause();
				// 哲学家饿了
				print(this + " " + "grabbing right");
				right.take();
				print(this + " " + "grabbing left");
				left.take();
				print(this + " " + "eating");
				pause();
				right.drop();
				left.drop();
			}
		}catch(InterruptedException e){
			print(this + " " + "exiting vid interrupt");
		}
	}
	public String toString(){ return "Philosopher " + id; }
}

/**
 * @Title Restaurant.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月12日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import static net.mindview.util.Print.*;

class Meal{
	private final int orderNum;
	public Meal(int orderNum){ this.orderNum = orderNum; }
	public String toString(){ return "Meal " + orderNum; }
}

class WaitPerson implements Runnable{
	private Restaurant restaurant;
	public WaitPerson(Restaurant r) { restaurant = r; }
	public void run(){
		try{
			while(!Thread.interrupted()){
				synchronized (this) {
					while(restaurant.meal == null)
						wait();
				}
				print("Waitperson got " + restaurant.meal);
				synchronized (restaurant.chef) {
					restaurant.meal = null;
					restaurant.chef.notifyAll();
				}
			}
		}catch(InterruptedException e){
			print("WaitPerson interrupted");
		}
	}
}

class Chef implements Runnable{
	private Restaurant restaurant;
	private int count = 0;
	public Chef(Restaurant r){ restaurant = r; }
	public void run(){
		try{
			while(!Thread.interrupted()){
				synchronized (this) {
					while(restaurant.meal != null)
						wait();
				}
				if(++count == 10){
					print("Out of food, closing");
					restaurant.exec.shutdownNow();
				}
				printnb("Order up!");
				synchronized (restaurant.waitPerson) {
					restaurant.meal = new Meal(count);
					restaurant.waitPerson.notifyAll();
				}
				TimeUnit.MICROSECONDS.sleep(100);
			}
		}catch(InterruptedException e){
			print("Chef interrupted");
		}
	}
}

/**
 * @ClassName Restaurant
 * @Description 生产者消费者
 * @author 吴扬颉
 * @date 2019年4月12日
 * 
 */
public class Restaurant {
	Meal meal;
	ExecutorService exec = Executors.newCachedThreadPool();
	WaitPerson waitPerson = new WaitPerson(this);
	Chef chef = new Chef(this);
	public Restaurant(){
		exec.execute(chef);
		exec.execute(waitPerson);
	}
	public static void main(String[] args) {
		new Restaurant();
	}
}

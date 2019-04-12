/**
 * @Title WaxOMatic.java
 * @Package ch21.waxomatic
 * @Description TODO
 * @author �����
 * @date 2019��4��11��
 * @version 1.0
 */
package ch21.waxomatic;
import java.util.concurrent.*;
import static net.mindview.util.Print.*;

class Car{
	private boolean waxOn = false;
	public synchronized void waxed(){
		waxOn = true; // ׼���׹�
		notifyAll();
	}
	public synchronized void buffed(){
		waxOn = false; // ׼������һ����
		notifyAll();
	}
	public synchronized void waitForWaxing() throws InterruptedException{
		while(waxOn == false)
			wait();
	}
	public synchronized void waitForBuffing() throws InterruptedException{
		while(waxOn == true)
			wait();
	}
}

class WaxOn implements Runnable{
	private Car car;
	public WaxOn(Car c){ car = c; }
	public void run(){
		try{
			while(!Thread.interrupted()){
				printnb("Wax On! ");
				TimeUnit.MICROSECONDS.sleep(200);
				car.waxed();
				car.waitForBuffing();
			}
		}catch(InterruptedException e){
			print("Exiting via interrupt");
		}
		print("Ending Wax On task");
	}
}

class WaxOff implements Runnable{
	private Car car;
	public WaxOff(Car c){ car = c; }
	public void run(){
		try{
			while(!Thread.interrupted()){
				car.waitForWaxing();
				printnb("Wax Off! ");
				TimeUnit.MICROSECONDS.sleep(200);
				car.buffed();
			}
		}catch(InterruptedException e){
			print("Exiting via interrupt");
		}
		print("Ending Wax Off task");
	}
}

/**
 * @ClassName WaxOMatic
 * @Description wait()�ڼ䣬�����ͷŵģ�����ͨ��notify()��ontifyAll()������ʱ�䵽�ڣ���wait()����������
 * @author �����
 * @date 2019��4��11��
 * 
 */
public class WaxOMatic {
	public static void main(String[] args) throws Exception{
		Car car = new Car();
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new WaxOff(car));
		exec.execute(new WaxOn(car));
		TimeUnit.SECONDS.sleep(5);
		exec.shutdownNow();
	}
}

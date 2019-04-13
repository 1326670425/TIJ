/**
 * @Title Chopstick.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月12日
 * @version 1.0
 */
package ch21;

/**
 * @ClassName Chopstick
 * @Description 哲学家就餐:筷子
 * @author 吴扬颉
 * @date 2019年4月12日
 * 
 */
public class Chopstick {
	private boolean taken = false;
	public synchronized void take() throws InterruptedException{
		while(taken)
			wait();
		taken = true;
	}
	public synchronized void drop(){
		taken = false;
		notifyAll();
	}
}

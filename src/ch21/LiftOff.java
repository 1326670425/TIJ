/**
 * @Title LiftOff.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;

/**
 * @ClassName LiftOff
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class LiftOff implements Runnable{
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
	public LiftOff(){}
	public LiftOff(int countDown){
		this.countDown = countDown;
	}
	public String status(){
		return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + "), ";
	}
	public void run(){
		while(countDown-- > 0){
			System.out.print(status());
			Thread.yield();
		}
	}
}

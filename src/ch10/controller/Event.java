/**
 * @Title Event.java
 * @Package ch10.controller
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月7日
 * @version 1.0
 */
package ch10.controller;

/**
 * @ClassName Event
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月7日
 * 
 */
public abstract class Event {
	private long eventTime;
	protected final long delayTime;
	public Event(long delayTime){
		this.delayTime = delayTime;
		start();
	}
	public void start(){
		eventTime = System.nanoTime() + delayTime;
	}
	public boolean ready(){
		return System.nanoTime() >= delayTime;
	}
	public abstract void action();
}

/**
 * @Title Event.java
 * @Package ch10.controller
 * @Description TODO
 * @author �����
 * @date 2019��1��7��
 * @version 1.0
 */
package ch10.controller;

/**
 * @ClassName Event
 * @Description TODO
 * @author �����
 * @date 2019��1��7��
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

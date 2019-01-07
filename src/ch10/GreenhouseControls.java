/**
 * @Title GreenhouseControls.java
 * @Package ch10
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月7日
 * @version 1.0
 */
package ch10;
import ch10.controller.*;
/**
 * @ClassName GreenhouseControls
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月7日
 * 
 */
public class GreenhouseControls extends Controller{
	private boolean light = false;
	public class LightOn extends Event{
		public LightOn(long delayTime){ super(delayTime); }
		public void action(){
			//这里放置硬件控制代码
			light = true;
		}
		public String toString(){ return "Light is on"; }
	}
	public class LightOff extends Event{
		public LightOff(long delayTime){ super(delayTime); }
		public void action(){
			//这里放置硬件控制代码
			light = false;
		}
		public String toString(){ return "Light is off"; }
	}
	private boolean water = false;
	public class WaterOn extends Event{
		public WaterOn(long delayTime){ super(delayTime); }
		public void action(){
			water = true;
		}
		public String toString(){ return "Greenhouse water is on"; }
	}
	public class WaterOff extends Event{
		public WaterOff(long delayTime){ super(delayTime); }
		public void action(){
			water = false;
		}
		public String toString(){ return "Greenhouse water is off"; }
	}
	private String thermostat = "Day";
	public class ThermostatNight extends Event{
		public ThermostatNight(long delayTime){ super(delayTime); }
		public void action(){
			thermostat = "Night";
		}
		public String toString(){ return "Thermostat on night setting"; }
	}
	public class ThermostatDay extends Event{
		public ThermostatDay(long delayTime){ super(delayTime); }
		public void action(){
			thermostat = "Day";
		}
		public String toString(){ return "Thermostat on day setting"; }
	}
	// An example of an action() that inserts a new one of itself into the event list:
	public class Bell extends Event{
		public Bell(long delayTime){ super(delayTime); }
		public void action(){
			addEvent(new Bell(delayTime));
		}
		public String toString(){ return "Bing!"; }
	}
	public class Restart extends Event{
		private Event[] eventList;
		public Restart(long delayTime, Event[] eventlist){
			super(delayTime);
			this.eventList = eventlist;
			for(Event e : eventlist)
				addEvent(e);
		}
		public void action(){
			for(Event e : eventList){
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);
		}
		public String toString(){ return "Restarting system"; }
	}
	public static class Terminate extends Event{
		public Terminate(long delayTime){ super(delayTime); }
		public void action(){ System.exit(0); }
		public String toString(){ return "Terminating"; }
	}
}

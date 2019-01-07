/**
 * @Title GreenhouseController.java
 * @Package ch10
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月7日
 * @version 1.0
 */
package ch10;
import ch10.controller.*;
/**
 * @ClassName GreenhouseController
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月7日
 * 
 */
public class GreenhouseController {
	public static void main(String[] args) {
		GreenhouseControls gc = new GreenhouseControls();
		// Instead of hard-wiring,you chould parse configuration information from a text file here：
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
				gc.new ThermostatNight(0),
				gc.new LightOn(200),
				gc.new LightOff(400),
				gc.new WaterOn(600),
				gc.new WaterOff(800),
				gc.new ThermostatDay(1400)
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		if(args.length == 1){
			gc.addEvent(
					new GreenhouseControls.Terminate(
							new Integer(args[0])
							)
					);
		}
		gc.run();
	}
}

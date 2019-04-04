/**
 * @Title TrafficLight.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月4日
 * @version 1.0
 */
package ch19;
import static net.mindview.util.Print.*;

enum Signal{ GREEN, YELLOW, RED, }

/**
 * @ClassName TrafficLight
 * @Description switch中使用enum
 * @author 吴扬颉
 * @date 2019年4月4日
 * 
 */
public class TrafficLight {
	Signal color = Signal.RED;
	public void change(){
		// 编译器并不会提示switch语句中没有default语句，只要覆盖了所有分支
		switch(color){
		case RED:
			color = Signal.GREEN;
			break;
		case GREEN:
			color = Signal.YELLOW;
			break;
		case YELLOW:
			color = Signal.RED;
			break;
		}
	}
	public String toString(){
		return "The traffic light is " + color;
	}
	public static void main(String[] args) {
		TrafficLight t = new TrafficLight();
		for(int i = 0; i < 7; i++){
			print(t);
			t.change();
		}
	}
}

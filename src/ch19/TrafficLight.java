/**
 * @Title TrafficLight.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��4��
 * @version 1.0
 */
package ch19;
import static net.mindview.util.Print.*;

enum Signal{ GREEN, YELLOW, RED, }

/**
 * @ClassName TrafficLight
 * @Description switch��ʹ��enum
 * @author �����
 * @date 2019��4��4��
 * 
 */
public class TrafficLight {
	Signal color = Signal.RED;
	public void change(){
		// ��������������ʾswitch�����û��default��䣬ֻҪ���������з�֧
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

/**
 * @Title DogsAndRobots.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月29日
 * @version 1.0
 */
package ch15;
import ch14.pets.*;

class PerformingDog extends Dog implements Performs{
	public void speak(){ System.out.println("Woof!"); }
	public void sit(){ System.out.println("Sitting"); }
	public void reproduce(){}
}

class Robot implements Performs{
	public void speak(){ System.out.println("Click!"); }
	public void sit(){ System.out.println("Clank!"); }
	public void oilChange(){}
}

class Communicate{
	public static <T extends Performs> void perform(T performer){
		performer.speak();
		performer.sit();
	}
}


/**
 * @ClassName DogsAndRobots
 * @Description Java试图实现潜在类型机制
 * @author 吴扬颉
 * @date 2019年3月29日
 * 
 */
public class DogsAndRobots {
	public static void main(String[] args) {
		PerformingDog d = new PerformingDog();
		Robot r = new Robot();
		Communicate.perform(d);
		Communicate.perform(r);
	}
}

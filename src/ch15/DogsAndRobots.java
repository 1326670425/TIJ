/**
 * @Title DogsAndRobots.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��29��
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
 * @Description Java��ͼʵ��Ǳ�����ͻ���
 * @author �����
 * @date 2019��3��29��
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

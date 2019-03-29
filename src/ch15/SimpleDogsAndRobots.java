/**
 * @Title SimpleDogsAndRobots.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月29日
 * @version 1.0
 */
package ch15;

class CommunicateSimply{
	static void perform(Performs performer){
		performer.speak();
		performer.sit();
	}
}

/**
 * @ClassName SimpleDogsAndRobots
 * @Description perform()不需要泛型，简单的指定为接受一个Performs对象就行
 * @author 吴扬颉
 * @date 2019年3月29日
 * 
 */
public class SimpleDogsAndRobots {
	public static void main(String[] args) {
		CommunicateSimply.perform(new PerformingDog());
		CommunicateSimply.perform(new Robot());
	}
}

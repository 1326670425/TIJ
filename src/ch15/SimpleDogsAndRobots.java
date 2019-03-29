/**
 * @Title SimpleDogsAndRobots.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��29��
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
 * @Description perform()����Ҫ���ͣ��򵥵�ָ��Ϊ����һ��Performs�������
 * @author �����
 * @date 2019��3��29��
 * 
 */
public class SimpleDogsAndRobots {
	public static void main(String[] args) {
		CommunicateSimply.perform(new PerformingDog());
		CommunicateSimply.perform(new Robot());
	}
}

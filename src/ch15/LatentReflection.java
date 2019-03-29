/**
 * @Title LatentReflection.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��29��
 * @version 1.0
 */
package ch15;
import java.lang.reflect.*;

import javax.management.RuntimeErrorException;
// δʵ��Performs�ӿ�
class Mime{
	public void walkAgainstTheWind(){}
	public void sit(){ System.out.println("Pretending to sit"); }
	public void pushInvisibleWalls(){}
	public String toString(){ return "Mime"; }
}
// δʵ��Performs�ӿ�
class SmartDog{
	public void speak(){ System.out.println("Woof!"); }
	public void sit(){ System.out.println("Sitting"); }
	public void reproduce(){}
}

class CommunicateReflectively{
	public static void perform(Object speaker){
		Class<?> spkr = speaker.getClass();
		try{
			try{
				Method speak = spkr.getMethod("speak");
				speak.invoke(speaker);
			}catch(NoSuchMethodException e){
				System.out.println(speaker + " can't speak");
			}
			try{
				Method sit = spkr.getMethod("sit");
				sit.invoke(speaker);
			}catch(NoSuchMethodException e){
				System.out.println(speaker + " can't sit");
			}
		}catch(Exception e){
			throw new RuntimeException(speaker.toString(), e);
		}
	}
}
/**
 * @ClassName LatentReflection
 * @Description ����ʵ��Ǳ�����ͻ���
 * @author �����
 * @date 2019��3��29��
 * 
 */
public class LatentReflection {
	public static void main(String[] args) {
		CommunicateReflectively.perform(new SmartDog());
		CommunicateReflectively.perform(new Robot());
		CommunicateReflectively.perform(new Mime());
	}
}

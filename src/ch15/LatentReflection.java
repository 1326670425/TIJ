/**
 * @Title LatentReflection.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月29日
 * @version 1.0
 */
package ch15;
import java.lang.reflect.*;

import javax.management.RuntimeErrorException;
// 未实现Performs接口
class Mime{
	public void walkAgainstTheWind(){}
	public void sit(){ System.out.println("Pretending to sit"); }
	public void pushInvisibleWalls(){}
	public String toString(){ return "Mime"; }
}
// 未实现Performs接口
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
 * @Description 反射实现潜在类型机制
 * @author 吴扬颉
 * @date 2019年3月29日
 * 
 */
public class LatentReflection {
	public static void main(String[] args) {
		CommunicateReflectively.perform(new SmartDog());
		CommunicateReflectively.perform(new Robot());
		CommunicateReflectively.perform(new Mime());
	}
}

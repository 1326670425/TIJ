/**
 * @Title ConstantSpecificMethod.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch19;
import java.util.*;
import java.text.*;
/**
 * @ClassName ConstantSpecificMethod
 * @Description 为enum实例编写方法，从而使其各自具有不同的行为。实现方法为：为enum定义一个或多个abstract方法，
 * 然后为每个enum实例实现该抽象方法
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public enum ConstantSpecificMethod {
	DATE_TIME{
		String getInfo(){
			return DateFormat.getDateInstance().format(new Date());
		}
	},
	CLASSPATH{
		String getInfo(){
			return System.getenv("CLASSPATH");
		}
	},
	VERSION{
		String getInfo(){
			return System.getProperty("java.version");
		}
	};
	abstract String getInfo();
	public static void main(String[] args) {
		for(ConstantSpecificMethod csm : values())
			System.out.println(csm.getInfo());
	}
	
}

/**
 * @Title HiddenImplementation.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月23日
 * @version 1.0
 */
package ch14;
import ch14.interfacea.*;
import ch14.packageaccess.*;
import java.lang.reflect.*;

/**
 * @ClassName HiddenImplementation
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月23日
 * 
 */
public class HiddenImplementation {
	public static void main(String[] args) throws Exception{
		A a = HiddenC.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		//编译错误，无法找到C
/*		if(a instanceof C){
			C c = (C)a;
			c.g();
		}*/
		callHiddenMethod(a, "g");
		callHiddenMethod(a, "u");
		callHiddenMethod(a, "v");
		callHiddenMethod(a, "w");
	}
	static void callHiddenMethod(Object a, String methodName) throws Exception{
		Method g = a.getClass().getDeclaredMethod(methodName);
		g.setAccessible(true);
		g.invoke(a);
	}
}

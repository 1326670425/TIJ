/**
 * @Title HiddenImplementation.java
 * @Package ch14
 * @Description TODO
 * @author �����
 * @date 2019��3��23��
 * @version 1.0
 */
package ch14;
import ch14.interfacea.*;
import ch14.packageaccess.*;
import java.lang.reflect.*;

/**
 * @ClassName HiddenImplementation
 * @Description TODO
 * @author �����
 * @date 2019��3��23��
 * 
 */
public class HiddenImplementation {
	public static void main(String[] args) throws Exception{
		A a = HiddenC.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		//��������޷��ҵ�C
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

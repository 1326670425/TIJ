/**
 * @Title InterfaceViolation.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月23日
 * @version 1.0
 */
package ch14;
import ch14.interfacea.*;

class B implements A{
	public void f() {}
	public void g() {}
}

/**
 * @ClassName InterfaceViolation
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月23日
 * 
 */
public class InterfaceViolation {
	public static void main(String[] args) {
		A a = new B();
		a.f();
		// a.g(); // 编译错误
		System.out.println(a.getClass().getName());
		if(a instanceof B){
			B b = (B)a;
			b.g();
		}
	}
}

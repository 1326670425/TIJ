/**
 * @Title InterfaceViolation.java
 * @Package ch14
 * @Description TODO
 * @author �����
 * @date 2019��3��23��
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
 * @author �����
 * @date 2019��3��23��
 * 
 */
public class InterfaceViolation {
	public static void main(String[] args) {
		A a = new B();
		a.f();
		// a.g(); // �������
		System.out.println(a.getClass().getName());
		if(a instanceof B){
			B b = (B)a;
			b.g();
		}
	}
}

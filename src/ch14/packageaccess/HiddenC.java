/**
 * @Title HiddenC.java
 * @Package ch14.packageaccess
 * @Description TODO
 * @author �����
 * @date 2019��3��23��
 * @version 1.0
 */
package ch14.packageaccess;
import ch14.interfacea.*;

class C implements A{
	public void f(){ System.out.println("public C.f()"); }
	public void g(){ System.out.println("public C.g()"); }
	void u(){ System.out.println("package C.u()"); }
	protected void v(){ System.out.println("protected C.v()"); }
	private void w(){ System.out.println("private C.w()"); }
}

/**
 * @ClassName HiddenC
 * @Description TODO
 * @author �����
 * @date 2019��3��23��
 * 
 */
public class HiddenC {
	public static A makeA(){ return new C(); }
}

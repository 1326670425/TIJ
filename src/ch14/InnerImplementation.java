/**
 * @Title InnerImplementation.java
 * @Package ch14
 * @Description TODO
 * @author �����
 * @date 2019��3��23��
 * @version 1.0
 */
package ch14;
import ch14.interfacea.*;

class InnerA{
	private static class C implements A{
		public void f(){ System.out.println("public C.f()"); }
		public void g(){ System.out.println("public C.g()"); }
		void u(){ System.out.println("package C.u()"); }
		protected void v(){ System.out.println("protected C.v()"); }
		private void w(){ System.out.println("private C.w()"); }
	}
	public static A makeA(){ return new C(); }
}

/**
 * @ClassName InnerImplementation
 * @Description TODO
 * @author �����
 * @date 2019��3��23��
 * 
 */
public class InnerImplementation {
	public static void main(String[] args) throws Exception{
		A a = InnerA.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		HiddenImplementation.callHiddenMethod(a, "g");
		HiddenImplementation.callHiddenMethod(a, "v");
		HiddenImplementation.callHiddenMethod(a, "u");
		HiddenImplementation.callHiddenMethod(a, "f");
	}
}

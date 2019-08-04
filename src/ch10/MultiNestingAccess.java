/**
 * @Title MultiNestingAccess.java
 * @Package ch10
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月31日
 * @version 1.0
 */
package ch10;

class MNA {
	private void f() {}
	class A {
		private void g() {}
		public class B {
			void h() {
				g();
				f();
			}
		}
	}
}

/**
 * @ClassName MultiNestingAccess
 * @Description 从多层嵌套类中访问外部类的成员
 * @author 吴扬颉
 * @date 2019年7月31日
 * 
 */
public class MultiNestingAccess {
	public static void main(String[] args) {
		MNA mna = new MNA();
		MNA.A mnaa = mna.new A();
		MNA.A.B mnaab = mnaa.new B();
		mnaab.h();
	}
}

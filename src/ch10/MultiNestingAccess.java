/**
 * @Title MultiNestingAccess.java
 * @Package ch10
 * @Description TODO
 * @author �����
 * @date 2019��7��31��
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
 * @Description �Ӷ��Ƕ�����з����ⲿ��ĳ�Ա
 * @author �����
 * @date 2019��7��31��
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

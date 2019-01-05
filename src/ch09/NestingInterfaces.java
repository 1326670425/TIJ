/**
 * @Title NestingInterfaces.java
 * @Package ch09
 * @Description TODO
 * @author �����
 * @date 2019��1��5��
 * @version 1.0
 */
package ch09;
class A{
	interface B{
		void f();
	}
	public class BImp implements B{
		public void f(){}
	}
	private class BImp2 implements B{
		public void f(){}
	}
	public interface C{
		void f();
	}
	class CImp implements C{
		public void f(){}
	}
	private class CImp2 implements C{
		public void f(){}
	}
	private interface D{
		public void f();
	}
	private class DImp implements D{
		public void f(){}
	}
	public class DImp2 implements D{
		public void f(){}
	}
	public D getD(){ return new DImp2(); }
	private D dRef;
	public void receiveD(D d){
		dRef = d;
		dRef.f();
	}
}

interface E{
	interface G{
		void f();
	}
	public interface H{
		void f();
	}
	void g();
	// �ӿ��в�������˽�нӿ�
	//! private interface I{}
}
/**
 * @ClassName NestingInterfaces
 * @Description Ƕ�׽ӿ�
 * @author �����
 * @date 2019��1��5��
 * 
 */
public class NestingInterfaces {
	public class BImp implements A.B{
		public void f(){}
	}
	class CImp implements A.C{
		public void f(){}
	}
	// ���ܼ̳г���ӿڣ������Ǹýӿ��ڶ������
	//! class DImp implements A.D{
	//! 	public void f(){}
	//! }
	class EImp implements E{
		public void g(){}
	}
	class EGImp implements E.G{
		public void f(){}
	}
	class EImp2 implements E{
		public void g(){}
		class EG implements E.G{
			public void f(){}
		}
	}
	public static void main(String[] args) {
		A a = new A();
		// ���ܷ���A.D��
		//! A.D ad = a.getD();
		// ֻ�ܷ���A.D:
		//! A.DImp2 di2 = a.getD();
		// ���ܷ��ʽӿ��еĳ�Ա
		//! a.getD().f();
		// Only another A can do anything with getD():
		A a2 = new A();
		a2.receiveD(a.getD());
	}
}

/**
 * @Title UnboundMethodReference.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

class X {
	String f() { return "X::f()"; }
}

interface MakeString {
	String make();
}

interface TransformX {
	String transfrom(X x);
}

/**
 * @ClassName UnboundMethodReference
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class UnboundMethodReference {
	public static void main(String[] args) {
		// ��Ȼmake()��f()������ͬ�ķ���ǩ������Ҳ�ᱨ��
		// ��Ϊʵ���ϻ���һ�����ز���this��������û��X�����ǰ���µ���f()����ˣ�
		// X::f��ʾδ�󶨵ķ������ã���Ϊ����δ���󶨡�������
		// MakeString ms = X::f;
		
		// ��Ҫһ��X����
		TransformX sp = X::f;
		X x = new X();
		System.out.println(sp.transfrom(x));
		System.out.println(x.f());
	}
}

/**
 * @Title GenericMethods.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��25��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName GenericMethods
 * @Description ���ͷ���ʾ��(���Ͳ����б����ڷ���ֵǰ��)�����ͷ�����ʹ��ʱ��ͨ������ָ���������ͣ���Ϊ��������Ϊ�����ҳ���������ͣ����Ϊ���Ͳ����ƶϡ�
 * @author �����
 * @date 2019��3��25��
 * 
 */
public class GenericMethods {
	public <T> void f(T x){
		System.out.println(x.getClass().getName());
	}
	public <A, B, C> void g(A a, B b, C c){
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
	}
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		gm.f("");
		gm.f(1);
		gm.f(1.0);
		gm.f(1.0F);
		gm.f('c');
		gm.f(gm);
		gm.g(1, "", gm);
	}
}

/**
 * @Title DotThis.java
 * @Package ch10
 * @Description TODO
 * @author �����
 * @date 2019��1��5��
 * @version 1.0
 */
package ch10;

/**
 * @ClassName DotThis
 * @Description �ڲ�������ⲿ����������
 * @author �����
 * @date 2019��1��5��
 * 
 */
public class DotThis {
	void f(){ System.out.println("DotThis.f()"); }
	public class Inner{
		public DotThis outer(){
			return DotThis.this;
		}
	}
	public Inner inner(){ return new Inner(); }
	public static void main(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().f();
	}
}

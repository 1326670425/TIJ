/**
 * @Title AnnoymousConstructor.java
 * @Package ch10
 * @Description TODO
 * @author �����
 * @date 2019��1��5��
 * @version 1.0
 */
package ch10;

abstract class Base{
	public Base(int i){
		System.out.println("Base constructor , i = " + i);
	}
	public abstract void f();
}

/**
 * @ClassName AnnoymousConstructor
 * @Description ʵ����ʼ����Ϊ�����ڲ��ഴ��һ��������
 * @author �����
 * @date 2019��1��5��
 * 
 */
public class AnnoymousConstructor {
	public static Base getBase(int i){
		return new Base(i){
			{ System.out.println("Inside instance initializer"); }
			public void f(){
				System.out.println("In annoymous f()");
			}
		};
	}
	public static void main(String[] args) {
		Base base = getBase(47);
		base.f();
	}
}

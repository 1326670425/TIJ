/**
 * @Title AnnoymousConstructor.java
 * @Package ch10
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月5日
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
 * @Description 实例初始化，为匿名内部类创建一个构造器
 * @author 吴扬颉
 * @date 2019年1月5日
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

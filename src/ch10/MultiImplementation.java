/**
 * @Title MultiImplementation.java
 * @Package ch10
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月6日
 * @version 1.0
 */
package ch10;

class D {}
abstract class E {}
class Z extends D{
	E makeE() { return new E() {}; }
}

/**
 * @ClassName MultiImplementation
 * @Description 使用内部类实现多继承
 * @author 吴扬颉
 * @date 2019年1月6日
 * 
 */
/*
 * (1) 内部类可以有多个实例，每个实例都有自己的状态信息，并且与其外围类对象的信息相互独立。
 * (2) 
 *  */
public class MultiImplementation {
	static void takesD(D d) {}
	static void takesE(E e) {}
	public static void main(String[] args) {
		Z z = new Z();
		takesD(z);
		takesE(z.makeE());
	}
}

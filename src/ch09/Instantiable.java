/**
 * @Title Instantiable.java
 * @Package ch09
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * @version 1.0
 */
package ch09;

abstract class Uninstantiable {
	abstract void f();
	abstract int g();
}

/**
 * @ClassName Instantiable
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * 
 */
public class Instantiable extends Uninstantiable {
	@Override
	void f() {
		System.out.println("f()");
	}
	@Override
	int g() {
		return 22;
	}
	public static void main(String[] args) {
		Uninstantiable ui = new Instantiable();
	}
}

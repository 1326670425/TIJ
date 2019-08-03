/**
 * @Title Instantiable.java
 * @Package ch09
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
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
 * @author 吴扬颉
 * @date 2019年7月27日
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

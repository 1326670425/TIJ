/**
 * @Title Looping.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import static onjava.Repeat.*;

/**
 * @ClassName Looping
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class Looping {
	static void hi() {
		System.out.println("Hi!");
	}
	public static void main(String[] args) {
		repeat(3, () -> System.out.println("Looping!"));
		repeat(2, Looping::hi);
	}
}

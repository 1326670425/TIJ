/**
 * @Title Bubbles.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.stream.*;

/**
 * @ClassName Bubbles
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class Bubbles {
	public static void main(String[] args) {
		Stream.generate(Bubble::bubbler)
			  .limit(5)
			  .forEach(System.out::println);
	}
}

/**
 * @Title FlatMap.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.stream.*;

/**
 * @ClassName FlatMap
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class FlatMap {
	public static void main(String[] args) {
		Stream.of(1, 2, 3)
			.flatMap(i -> Stream.of("Gonzo", "Kermit", "Beaker"))
			.forEach(System.out::println);
	}
}

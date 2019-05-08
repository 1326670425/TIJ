/**
 * @Title FlatMap.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.stream.*;

/**
 * @ClassName FlatMap
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class FlatMap {
	public static void main(String[] args) {
		Stream.of(1, 2, 3)
			.flatMap(i -> Stream.of("Gonzo", "Kermit", "Beaker"))
			.forEach(System.out::println);
	}
}

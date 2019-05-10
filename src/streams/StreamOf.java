/**
 * @Title StreamOf.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.stream.*;

/**
 * @ClassName StreamOf
 * @Description 流创建，使用Stream.of()很容易将一组元素转化成流
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class StreamOf {
	public static void main(String[] args) {
		Stream.of(new Bubble(1), new Bubble(2), new Bubble(3))
			.forEach(System.out::println);
		Stream.of("It's ", "a ", "wonderful ", "day ", "for ", "pie!")
			.forEach(System.out::print);
		System.out.println();
		Stream.of(3.14159, 2.718, 1.618)
		.forEach(System.out::println);
	}
}

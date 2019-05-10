/**
 * @Title StreamOfStreams.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.stream.*;

/**
 * @ClassName StreamOfStreams
 * @Description 在map()期间组合流
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class StreamOfStreams {
	public static void main(String[] args) {
		Stream.of(1, 2, 3)
			.map(i -> Stream.of("Gonzo", "Kermit", "Beaker"))
			.map(e -> e.getClass().getName())
			.forEach(System.out::println);
	}
}

/**
 * @Title StreamOfRandoms.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;

/**
 * @ClassName StreamOfRandoms
 * @Description 从一个整数开始，然后每个整数去创建许多随机数
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class StreamOfRandoms {
	static Random rand = new Random(47);
	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4, 5)
			.flatMapToInt(i -> IntStream.concat(
					rand.ints(0, 100).limit(i), IntStream.of(-1)))
					.forEach(n -> System.out.format("%d ", n));
	}
}

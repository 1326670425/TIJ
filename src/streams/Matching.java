/**
 * @Title Matching.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月5日
 * @version 1.0
 */
package streams;

import java.util.stream.*;
import java.util.function.*;
import static streams.RandInts.*;

interface Matcher extends BiPredicate<Stream<Integer>, Predicate<Integer>> {}

/**
 * @ClassName Matching
 * @Description 匹配相关方法
 * @author 吴扬颉
 * @date 2019年5月5日
 * 
 */
public class Matching {
	static void show(Matcher match, int val) {
		System.out.println(match.test(
				IntStream.rangeClosed(1, 9)
					.boxed()
					.peek(n -> System.out.format("%d ", n)), 
				n -> n < val));
	}
	public static void main(String[] args) {
		show(Stream::allMatch, 10);
		show(Stream::allMatch, 4);
		show(Stream::anyMatch, 2);
		show(Stream::anyMatch, 0);
		show(Stream::noneMatch, 5);
		show(Stream::noneMatch, 0);
	}
}

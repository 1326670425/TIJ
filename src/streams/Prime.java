/**
 * @Title Prime.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.stream.*;
import static java.util.stream.LongStream.*;

/**
 * @ClassName Prime
 * @Description 操作流元素
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class Prime {
	public static Boolean isPrime(long n) {
		// 包含上限的range
		return rangeClosed(2, (long)Math.sqrt(n)).noneMatch(i -> n % i == 0);
	}
	public LongStream numbers() {
		return iterate(2, i -> i + 1).filter(Prime::isPrime);
	}
	public static void main(String[] args) {
		new Prime().numbers()
			.limit(10)
			.forEach(n -> System.out.format("%d ", n));
		System.out.println();
		new Prime().numbers()
			.skip(90)
			.limit(10)
			.forEach(n -> System.out.format("%d ", n));
	}
}

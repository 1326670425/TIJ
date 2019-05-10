/**
 * @Title Ranges.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import static java.util.stream.IntStream.*;

/**
 * @ClassName Ranges
 * @Description Ranges of int
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class Ranges {
	public static void main(String[] args) {
		// 传统方式
		int result = 0;
		for (int i = 10; i < 20; i++) {
			result += i;
		}
		System.out.println(result);
		
		// range
		result = 0;
		for (int i : range(10, 20).toArray())
			result += i;
		System.out.println(result);
		
		// 流
		System.out.println(range(10, 20).sum());
	}
}

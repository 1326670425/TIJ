/**
 * @Title Fibonacci.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.stream.*;

/**
 * @ClassName Fibonacci
 * @Description iterate()生成斐波那契数列
 * <p>Stream.iterate()以种子（第一个参数）开头，将其传给方法（第二个参数）。方法的结果添加到流，
 * 并存储作为第一个参数用于下次调用iterate()
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class Fibonacci {
	int x = 1;
	Stream<Integer> numbers() {
		return Stream.iterate(0, i -> {
			int result = x + i;
			x = i;
			return result;
		});
	}
	public static void main(String[] args) {
		new Fibonacci().numbers()
					   .skip(20) // 跳过前20个元素
					   .limit(10)
					   .forEach(System.out::println);
	}
}

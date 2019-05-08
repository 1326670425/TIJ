/**
 * @Title LastElement.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月5日
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;

/**
 * @ClassName LastElement
 * @Description 使用reduce()返回流中最后一个元素
 * @author 吴扬颉
 * @date 2019年5月5日
 * 
 */
public class LastElement {
	public static void main(String[] args) {
		OptionalInt last = IntStream.range(10, 20).reduce((n1, n2) -> n2);
		System.out.println(last.orElse(-1));
		// 非数字对象
		Optional<String> lastobj = Stream.of("one", "two", "three").reduce((n1, n2) -> n2);
		System.out.println(lastobj.orElse("Nothing there!"));
	}
}

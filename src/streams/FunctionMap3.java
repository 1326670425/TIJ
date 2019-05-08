/**
 * @Title FunctionMap3.java
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
 * @ClassName FunctionMap3
 * @Description 如果产生的结果是数值类型，需要使用mapTo***操作
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class FunctionMap3 {
	public static void main(String[] args) {
		Stream.of("5", "7", "9")
			.mapToInt(Integer::parseInt)
			.forEach(n -> System.out.format("%d ", n));
		System.out.println();
		
		Stream.of("17", "19", "23")
			.mapToLong(Long::parseLong)
			.forEach(n -> System.out.format("%d ", n));
		System.out.println();
		
		Stream.of("17", "1.9", ".23")
			.mapToDouble(Double::parseDouble)
			.forEach(n -> System.out.format("%f ", n));
		System.out.println();
	}
}

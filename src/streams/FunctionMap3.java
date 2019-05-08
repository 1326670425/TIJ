/**
 * @Title FunctionMap3.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;

/**
 * @ClassName FunctionMap3
 * @Description ��������Ľ������ֵ���ͣ���Ҫʹ��mapTo***����
 * @author �����
 * @date 2019��5��4��
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

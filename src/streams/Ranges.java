/**
 * @Title Ranges.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import static java.util.stream.IntStream.*;

/**
 * @ClassName Ranges
 * @Description Ranges of int
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class Ranges {
	public static void main(String[] args) {
		// ��ͳ��ʽ
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
		
		// ��
		System.out.println(range(10, 20).sum());
	}
}

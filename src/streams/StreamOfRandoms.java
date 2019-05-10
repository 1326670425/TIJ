/**
 * @Title StreamOfRandoms.java
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
 * @ClassName StreamOfRandoms
 * @Description ��һ��������ʼ��Ȼ��ÿ������ȥ������������
 * @author �����
 * @date 2019��5��4��
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

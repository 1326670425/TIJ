/**
 * @Title RandInts.java
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
 * @ClassName RandInts
 * @Description �ն˲�����ת��������
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class RandInts {
	private static int[] rints = new Random(47).ints(0, 1000)
										.limit(100)
										.toArray();
	public static IntStream rands() {
		return Arrays.stream(rints);
	}
}

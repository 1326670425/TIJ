/**
 * @Title RandInts.java
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
 * @ClassName RandInts
 * @Description 终端操作：转化成数组
 * @author 吴扬颉
 * @date 2019年5月4日
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

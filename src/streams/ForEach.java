/**
 * @Title ForEach.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;
import static streams.RandInts.*;

/**
 * @ClassName ForEach
 * @Description 为每个元素应用最终操作
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class ForEach {
	static final int SZ = 14;
	public static void main(String[] args) {
		rands().limit(SZ)
			.forEach(n -> System.out.format("%d ", n));
		System.out.println();
		rands().limit(SZ)
			.parallel()// 尝试在多个处理器上操作
			.forEach(n -> System.out.format("%d ", n));
		System.out.println();
		rands().limit(SZ)
			.parallel()
			.forEachOrdered(n -> System.out.format("%d ", n));
	}
}

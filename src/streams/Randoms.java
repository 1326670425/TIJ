/**
 * @Title Randoms.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.*;

/**
 * @ClassName Randoms
 * @Description 流式编程，显示5到20之间随机选择的序列中只出现一次的数字
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class Randoms {
	public static void main(String[] args) {
		new Random(47)
			.ints(5, 20)
			.distinct()
			.limit(7)
			.sorted()
			.forEach(System.out::println);
	}
}

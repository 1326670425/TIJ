/**
 * @Title SortedComparator.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.*;

/**
 * @ClassName SortedComparator
 * @Description 排序流中元素
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class SortedComparator {
	public static void main(String[] args) throws Exception {
		FileToWords.stream("src/streams/Cheese.dat")
			.skip(10)
			.limit(10)
			.sorted(Comparator.reverseOrder())
			.map(w -> w + " ")
			.forEach(System.out::print);
	}
}

/**
 * @Title SortedComparator.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.*;

/**
 * @ClassName SortedComparator
 * @Description ��������Ԫ��
 * @author �����
 * @date 2019��5��4��
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

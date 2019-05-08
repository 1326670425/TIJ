/**
 * @Title ImperativeRandoms.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.*;

/**
 * @ClassName ImperativeRandoms
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class ImperativeRandoms {
	public static void main(String[] args) {
		Random rand = new Random(47);
		// 排序集合，保证元素不重复且排好序
		SortedSet<Integer> rints = new TreeSet<>();
		while(rints.size() < 7) {
			int r = rand.nextInt(20);
			// nextInt()下界为0，所以过滤小于5的值
			if(r < 5)
				continue;
			rints.add(r);
		}
		System.out.println(rints);
	}
}

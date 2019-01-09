/**
 * @Title AddingGroups.java
 * @Package ch11
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * @version 1.0
 */
package ch11;

import java.util.*;

/**
 * @ClassName AddingGroups
 * @Description 集合中添加一组元素
 * @author 吴扬颉
 * @date 2019年1月9日
 * 
 */
public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> collection = 
				new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Integer[] moreInts = {6, 7, 8, 9};
		collection.addAll(Arrays.asList(moreInts));
		// Runs significantly faster, but you can't construct a Collection this way
		// 运行速度显著加快，但是你不能通过这种方式来创建一个Collection
		Collections.addAll(collection, 10, 11, 12, 13);
		Collections.addAll(collection, moreInts);
		
		List<Integer> list = Arrays.asList(14, 15, 16, 17);
		list.set(1, 99);
		// list.add(18);运行时错误，因为底层是数组，无法改变大小
	}
}

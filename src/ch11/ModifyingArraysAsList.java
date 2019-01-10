/**
 * @Title ModifyingArraysAsList.java
 * @Package ch11
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * @version 1.0
 */
package ch11;
import java.util.*;
/**
 * @ClassName ModifyingArraysAsList
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * 
 */
public class ModifyingArraysAsList {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer[] ia = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		List<Integer> list1 = 
				new ArrayList<Integer>(Arrays.asList(ia));
		System.out.println("Before shuffling: " + list1);
		Collections.shuffle(list1,rand);
		System.out.println("After shuffling: " + list1);
		System.out.println("array: " + Arrays.toString(ia));
		List<Integer> list2 = Arrays.asList(ia);
		System.out.println("Before shuffling: " + list2);
		Collections.shuffle(list2, rand);
		System.out.println("After shuffling: " + list2);
		System.out.println("array: " + Arrays.toString(ia));
	}
}

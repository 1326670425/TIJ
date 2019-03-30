/**
 * @Title ArraySearching.java
 * @Package ch16
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月30日
 * @version 1.0
 */
package ch16;

import java.util.*;
import net.mindview.util.*;

/**
 * @ClassName ArraySearching
 * @Description 如果数组包含重复元素，无法保证找到的是哪个
 * @author 吴扬颉
 * @date 2019年3月30日
 * 
 */
public class ArraySearching {
	public static void main(String[] args) {
		Generator<Integer> gen = new RandomGenerator.Integer(1000);
		int[] a = ConvertTo.primitive(Generated.array(new Integer[25], gen));
		Arrays.sort(a);
		System.out.println("Sorted array: " + Arrays.toString(a));
		while(true){
			int r = gen.next();
			int location = Arrays.binarySearch(a, r);
			if(location >= 0){
				System.out.println("Location of " + r + " is " + location + ", a[" + location + "]= " + a[location]);
				break;
			}
		}
	}
}

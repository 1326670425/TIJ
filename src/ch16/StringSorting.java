/**
 * @Title StringSorting.java
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
 * @ClassName StringSorting
 * @Description String排序
 * @author 吴扬颉
 * @date 2019年3月30日
 * 
 */
public class StringSorting {
	public static void main(String[] args) {
		String[] sa = Generated.array(new String[20], new RandomGenerator.String(5));
		System.out.println("before sorting:");
		System.out.println(Arrays.toString(sa));
		Arrays.sort(sa);
		System.out.println("after sorting:");
		Arrays.sort(sa, Collections.reverseOrder());
		System.out.println("Reverse sorting:");
		System.out.println(Arrays.toString(sa));
		// 默认是大写字母在前，下面这样可以忽略大小写
		Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
		System.out.println("Case-insensitive sorting:");
		System.out.println(Arrays.toString(sa));
		
	}
}

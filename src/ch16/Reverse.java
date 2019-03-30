/**
 * @Title Reverse.java
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
 * @ClassName Reverse
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月30日
 * 
 */
public class Reverse {
	public static void main(String[] args) {
		CompType[] a = Generated.array(new CompType[12], CompType.generator());
		System.out.println("before sorting:");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("after sorting:");
		System.out.println(Arrays.toString(a));
	}
}

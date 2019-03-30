/**
 * @Title ComparatorTest.java
 * @Package ch16
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月30日
 * @version 1.0
 */
package ch16;
import java.util.*;
import net.mindview.util.*;

class CompTypeComparator implements Comparator<CompType>{
	public int compare(CompType o1, CompType o2){
		return (o1.j < o2.j ? -1 : (o1.j == o2.j ? 0 : 1));
	}
}

/**
 * @ClassName ComparatorTest
 * @Description 比较：实现Comparator接口
 * @author 吴扬颉
 * @date 2019年3月30日
 * 
 */
public class ComparatorTest {
	public static void main(String[] args) {
		CompType[] a = Generated.array(new CompType[12], CompType.generator());
		System.out.println("before sorting:");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a, new CompTypeComparator());
		System.out.println("after sorting:");
		System.out.println(Arrays.toString(a));
	}
}

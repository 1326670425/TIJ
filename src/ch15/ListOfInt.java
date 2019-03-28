/**
 * @Title ListOfInt.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName ListOfInt
 * @Description 基本数据类型不能用作类型参数，要用对应的包装类。但是自动包装机制不能用于数组
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class ListOfInt {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++)
			li.add(i);
		for(int i : li)
			System.out.print(i + " ");
	}
}

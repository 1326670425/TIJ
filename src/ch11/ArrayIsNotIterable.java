/**
 * @Title ArrayIsNotIterable.java
 * @Package ch11
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * @version 1.0
 */
package ch11;
import java.util.*;
/**
 * @ClassName ArrayIsNotIterable
 * @Description foreach语句可以用于数组或其他任何Iterable，但这并不意味着数组也是Iterable，而任何自动包装也不会发生
 * @author 吴扬颉
 * @date 2019年1月10日
 * 
 */
public class ArrayIsNotIterable {
	static <T> void test(Iterable<T> ib){
		for(T t : ib)
			System.out.print(t + " ");
	}
	public static void main(String[] args) {
		test(Arrays.asList(1, 2, 3));
		String[] strings = {"A", "B", "C"};
		// 数组可以使用foreach遍历，但它不是Iterable
		//! test(strings);
		// 不存在任何从数组到Iterable的转换，必须手动转换为一个Iterable
		test(Arrays.asList(strings));
	}
}

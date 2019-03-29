/**
 * @Title MultidimensionalPrimitiveArray.java
 * @Package ch16
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月29日
 * @version 1.0
 */
package ch16;
import java.util.*;
/**
 * @ClassName MultidimensionalPrimitiveArray
 * @Description 创建多维数组
 * @author 吴扬颉
 * @date 2019年3月29日
 * 
 */
public class MultidimensionalPrimitiveArray {
	public static void main(String[] args) {
		int[][] a = {
				{1, 2, 3},
				{4, 5, 6}
		};
		// 该方法可以显示多维数组
		System.out.println(Arrays.deepToString(a));
	}
}

/**
 * @Title ThreeDWithNew.java
 * @Package ch16
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月29日
 * @version 1.0
 */
package ch16;
import java.util.*;
/**
 * @ClassName ThreeDWithNew
 * @Description 用new关键字创建三维数组
 * @author 吴扬颉
 * @date 2019年3月29日
 * 
 */
public class ThreeDWithNew {
	public static void main(String[] args) {
		int[][][] a = new int[2][3][4];
		System.out.println(Arrays.deepToString(a));
	}
}

/**
 * @Title AutoboxingArrays.java
 * @Package ch16
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月29日
 * @version 1.0
 */
package ch16;
import java.util.*;
/**
 * @ClassName AutoboxingArrays
 * @Description 自动装箱数组
 * @author 吴扬颉
 * @date 2019年3月29日
 * 
 */
public class AutoboxingArrays {
	  public static void main(String[] args) {
	    Integer[][] a = { // Autoboxing:
	      { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
	      { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 },
	      { 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 },
	      { 71, 72, 73, 74, 75, 76, 77, 78, 79, 80 },
	    };
	    System.out.println(Arrays.deepToString(a));
	  }
}

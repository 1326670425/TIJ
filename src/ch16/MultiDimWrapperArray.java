/**
 * @Title MultiDimWrapperArray.java
 * @Package ch16
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月29日
 * @version 1.0
 */
package ch16;
import java.util.*;
/**
 * @ClassName MultiDimWrapperArray
 * @Description Arrays.deepToString()对基本类型和对象数组都适用
 * @author 吴扬颉
 * @date 2019年3月29日
 * 
 */
public class MultiDimWrapperArray {
	  public static void main(String[] args) {
		    Integer[][] a1 = { // Autoboxing
		      { 1, 2, 3, },
		      { 4, 5, 6, },
		    };
		    Double[][][] a2 = { // Autoboxing
		      { { 1.1, 2.2 }, { 3.3, 4.4 } },
		      { { 5.5, 6.6 }, { 7.7, 8.8 } },
		      { { 9.9, 1.2 }, { 2.3, 3.4 } },
		    };
		    String[][] a3 = {
		      { "The", "Quick", "Sly", "Fox" },
		      { "Jumped", "Over" },
		      { "The", "Lazy", "Brown", "Dog", "and", "friend" },
		    };
		    System.out.println("a1: " + Arrays.deepToString(a1));
		    System.out.println("a2: " + Arrays.deepToString(a2));
		    System.out.println("a3: " + Arrays.deepToString(a3));
		  }
}

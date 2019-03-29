/**
 * @Title AssemblingMultidimensionalArrays.java
 * @Package ch16
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月29日
 * @version 1.0
 */
package ch16;
import java.util.*;
/**
 * @ClassName AssemblingMultidimensionalArrays
 * @Description 逐个初始化数组
 * @author 吴扬颉
 * @date 2019年3月29日
 * 
 */
public class AssemblingMultidimensionalArrays {
	  public static void main(String[] args) {
		    Integer[][] a;
		    a = new Integer[3][];
		    for(int i = 0; i < a.length; i++) {
		      a[i] = new Integer[3];
		      for(int j = 0; j < a[i].length; j++)
		        a[i][j] = i * j; // Autoboxing
		    }
		    System.out.println(Arrays.deepToString(a));
		  }
}

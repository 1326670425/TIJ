/**
 * @Title AssemblingMultidimensionalArrays.java
 * @Package ch16
 * @Description TODO
 * @author �����
 * @date 2019��3��29��
 * @version 1.0
 */
package ch16;
import java.util.*;
/**
 * @ClassName AssemblingMultidimensionalArrays
 * @Description �����ʼ������
 * @author �����
 * @date 2019��3��29��
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

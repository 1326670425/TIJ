/**
 * @Title MultidimensionalObjectArrays.java
 * @Package ch16
 * @Description TODO
 * @author �����
 * @date 2019��3��29��
 * @version 1.0
 */
package ch16;
import java.util.*;
/**
 * @ClassName MultidimensionalObjectArrays
 * @Description ��ά����ֲ�����
 * @author �����
 * @date 2019��3��29��
 * 
 */
public class MultidimensionalObjectArrays {
	  public static void main(String[] args) {
	    BerylliumSphere[][] spheres = {
	      { new BerylliumSphere(), new BerylliumSphere() },
	      { new BerylliumSphere(), new BerylliumSphere(),
	        new BerylliumSphere(), new BerylliumSphere() },
	      { new BerylliumSphere(), new BerylliumSphere(),
	        new BerylliumSphere(), new BerylliumSphere(),
	        new BerylliumSphere(), new BerylliumSphere(),
	        new BerylliumSphere(), new BerylliumSphere() },
	    };
	    System.out.println(Arrays.deepToString(spheres));
	  }
	}

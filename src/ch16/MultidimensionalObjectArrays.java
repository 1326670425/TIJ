/**
 * @Title MultidimensionalObjectArrays.java
 * @Package ch16
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月29日
 * @version 1.0
 */
package ch16;
import java.util.*;
/**
 * @ClassName MultidimensionalObjectArrays
 * @Description 多维对象粗糙数组
 * @author 吴扬颉
 * @date 2019年3月29日
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

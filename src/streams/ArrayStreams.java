/**
 * @Title ArrayStreams.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;

/**
 * @ClassName ArrayStreams
 * @Description 数组转为流
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class ArrayStreams {
	public static void main(String[] args) {
		Arrays.stream(new double[] {3.14159, 2.718, 1.618})
			  .forEach(n -> System.out.format("%f ", n));
		System.out.println();
		
		Arrays.stream(new int[] {1, 3, 5})
		  .forEach(n -> System.out.format("%d ", n));
		System.out.println();
		
		Arrays.stream(new long[] {11, 22, 44, 66})
		  .forEach(n -> System.out.format("%d ", n));
		System.out.println();
		
		Arrays.stream(new int[] {1, 3, 5, 7, 15, 28, 37}, 3, 6)
			  .forEach(n -> System.out.format("%d ", n));
	}
}

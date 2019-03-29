/**
 * @Title RaggedArray.java
 * @Package ch16
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月29日
 * @version 1.0
 */
package ch16;
import java.util.*;
/**
 * @ClassName RaggedArray
 * @Description 粗糙数组：各维度长度不同
 * @author 吴扬颉
 * @date 2019年3月29日
 * 
 */
public class RaggedArray {
	public static void main(String[] args) {
		Random rand = new Random(47);
		int[][][] a = new int[rand.nextInt(7)][][];
		for(int i = 0; i < a.length; i++){
			a[i] = new int[rand.nextInt(5)][];
			for(int j = 0; j < a[i].length; j++)
				a[i][j] = new int[rand.nextInt(5)];
		}
		System.out.println(Arrays.deepToString(a));
	}
}

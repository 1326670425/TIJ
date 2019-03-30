/**
 * @Title CopyingArrays.java
 * @Package ch16
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月30日
 * @version 1.0
 */
package ch16;
import java.util.*;

/**
 * @ClassName CopyingArrays
 * @Description 数组复制
 * <p>System.arraycopy()不会执行自动装箱和自动拆箱。复制对象数组只是复制了对象的引用（浅复制）
 * @author 吴扬颉
 * @date 2019年3月30日
 * 
 */
public class CopyingArrays {
	public static void main(String[] args) {
		int[] i = new int[7];
		int[] j = new int[10];
		Arrays.fill(i, 47);
		Arrays.fill(j, 99);
		System.out.println("i = " + Arrays.toString(i));
		System.out.println("j = " + Arrays.toString(j));
		System.arraycopy(i, 0, j, 0, i.length);
		System.out.println("j = " + Arrays.toString(j));
		int[] k = new int[5];
		Arrays.fill(k, 103);
		System.arraycopy(i, 0, k, 0, k.length);
		System.out.println("k = " + Arrays.toString(k));
		Arrays.fill(k, 103);
		System.arraycopy(k, 0, i, 0, k.length);
		System.out.println("i = " + Arrays.toString(i));
		
		Integer[] u = new Integer[10];
		Integer[] v = new Integer[5];
		Arrays.fill(u, new Integer(47));
		Arrays.fill(v, new Integer(99));
		System.out.println("u = " + Arrays.toString(u));
		System.out.println("v = " + Arrays.toString(v));
		System.arraycopy(v, 0, u, u.length / 2, v.length);
		System.out.println("u = " + Arrays.toString(u));
		
	}
}

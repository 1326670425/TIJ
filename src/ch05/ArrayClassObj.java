/**
 * @Title ArrayClassObj.java
 * @Package ch05
 * @Description TODO
 * @author 吴扬颉
 * @date 2018年12月29日
 * @version 1.0
 */
package ch05;
import java.util.*;

/**
 * @ClassName ArrayClassObj
 * @Description TODO
 * @author 吴扬颉
 * @date 2018年12月29日
 * 
 */
public class ArrayClassObj {
	public static void main(String[] args){
		Random rand = new Random(47);
		Integer[] a = new Integer[rand.nextInt(20)];
		System.out.println(a.length);
		for(int i = 0;i<a.length;i++)
			a[i] = rand.nextInt(500);//自动装箱
		System.out.println(Arrays.toString(a));
		for(int x:a)
			System.out.print(x+" ");
		
	}
}

/**
 * @Title ErasedTypeEquivalence.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName ErasedTypeEquivalence
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * 
 */
public class ErasedTypeEquivalence {
	public static void main(String[] args) {
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1 == c2);
	}
}

/**
 * @Title ErasedTypeEquivalence.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName ErasedTypeEquivalence
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * 
 */
public class ErasedTypeEquivalence {
	public static void main(String[] args) {
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1 == c2);
	}
}

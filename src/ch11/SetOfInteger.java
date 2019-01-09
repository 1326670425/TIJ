/**
 * @Title SetOfInteger.java
 * @Package ch11
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * @version 1.0
 */
package ch11;
import java.util.*;
/**
 * @ClassName SetOfInteger
 * @Description Set
 * @author 吴扬颉
 * @date 2019年1月9日
 * 
 */
public class SetOfInteger {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Set<Integer> intset = new HashSet<Integer>();
		for (int i = 0; i < 10000; i++) {
			intset.add(rand.nextInt(30));
		}
		System.out.println(intset);
	}
}

/**
 * @Title Sets.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月25日
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName Sets
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月25日
 * 
 */
public class Sets {
	//并集
	public static <T> Set<T> union(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.addAll(b);
		return result;
	}
	//交集
	public static <T> Set<T> intersection(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.retainAll(b);
		return result;
	}
	//差集
	public static <T> Set<T> difference(Set<T> superset, Set<T> subset){
		Set<T> result = new HashSet<T>(superset);
		result.removeAll(subset);
		return result;
	}
	//补集
	public static <T> Set<T> complement(Set<T> a, Set<T> b){
		return difference(union(a, b), intersection(a, b));
	}
}

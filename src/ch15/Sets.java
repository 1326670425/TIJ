/**
 * @Title Sets.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��25��
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName Sets
 * @Description TODO
 * @author �����
 * @date 2019��3��25��
 * 
 */
public class Sets {
	//����
	public static <T> Set<T> union(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.addAll(b);
		return result;
	}
	//����
	public static <T> Set<T> intersection(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.retainAll(b);
		return result;
	}
	//�
	public static <T> Set<T> difference(Set<T> superset, Set<T> subset){
		Set<T> result = new HashSet<T>(superset);
		result.removeAll(subset);
		return result;
	}
	//����
	public static <T> Set<T> complement(Set<T> a, Set<T> b){
		return difference(union(a, b), intersection(a, b));
	}
}

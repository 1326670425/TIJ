/**
 * @Title Synchronization.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月1日
 * @version 1.0
 */
package ch17;
import java.util.*;

/**
 * @ClassName Synchronization
 * @Description Collection的同步控制。最好像类中所示，直接将新生成的容器传递给适当的同步方法，
 * 这样做不会有任何机会暴露出不同步的版本
 * @author 吴扬颉
 * @date 2019年4月1日
 * 
 */
public class Synchronization {
	public static void main(String[] args) {
		Collection<String> c = Collections.synchronizedCollection(new ArrayList<String>());
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		Set<String> s = Collections.synchronizedSet(new HashSet<String>());
		Set<String> ss = Collections.synchronizedSortedSet(new TreeSet<String>());
		Map<String, String> m = Collections.synchronizedMap(new HashMap<String, String>());
		Map<String, String> sm = Collections.synchronizedSortedMap(new TreeMap<String, String>());
		
	}
}

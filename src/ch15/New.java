/**
 * @Title New.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月25日
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName New
 * @Description 工具类，专门用来创建各种常用的容器对象，通过类型参数推断简化工作（类型推断只对赋值操作有效，其他时候不起作用，比如不能用于参数传递）
 * @author 吴扬颉
 * @date 2019年3月25日
 * 
 */
public class New {
	public static <K, V> Map<K, V> map(){
		return new HashMap<K, V>();
	}
	public static <T> List<T> list(){
		return new ArrayList<T>();
	}
	public static <T> LinkedList<T> lList(){
		return new LinkedList<T>();
	}
	public static <T> Set<T> set(){
		return new HashSet<T>();
	}
	public static <T> Queue<T> queue(){
		return new LinkedList<T>();
	}
	
	public static void main(String[] args) {
		Map<String, List<String>> sls = New.map();
		List<String> ls = New.list();
		LinkedList<String> lls = New.lList();
		Set<String> ss = New.set();
		Queue<String> qs = New.queue();
	}
	
}

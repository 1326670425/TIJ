/**
 * @Title GenericVarargs.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月25日
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName GenericVarargs
 * @Description 泛型方法和可变参数列表结合。makeList()展示了与标准类库中的java.util.Arrays.asList()相同的功能
 * @author 吴扬颉
 * @date 2019年3月25日
 * 
 */
public class GenericVarargs {
	public static <T> List<T> makeList(T... args){
		List<T> result = new ArrayList<T>();
		for(T item : args)
			result.add(item);
		return result;
	}
	public static void main(String[] args) {
		List<String> ls = makeList("A");
		System.out.println(ls);
		ls = makeList("A", "B", "C");
		System.out.println(ls);
		ls = makeList("ABCDEFG".split(""));
		System.out.println(ls);
	}
}

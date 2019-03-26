/**
 * @Title FilledListMaker.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName FilledListMaker
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * 
 */
public class FilledListMaker<T> {
	List<T> create(T t, int n){
		List<T> result = new ArrayList<T>();
		for(int i = 0; i < n; i++)
			result.add(t);
		return result;
	}
	public static void main(String[] args) {
		FilledListMaker<String> stringMaker = new FilledListMaker<String>();
		List<String> list = stringMaker.create("hello", 4);
		System.out.println(list);
	}
}

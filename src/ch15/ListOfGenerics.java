/**
 * @Title ListOfGenerics.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName ListOfGenerics
 * @Description 泛型数组
 * @author 吴扬颉
 * @date 2019年3月26日
 * 
 */
public class ListOfGenerics<T> {
	private List<T> array = new ArrayList<T>();
	public void add(T item){ array.add(item); }
	public T get(int index){ return array.get(index); }
}

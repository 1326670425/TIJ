/**
 * @Title ArrayMaker.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * @version 1.0
 */
package ch15;
import java.lang.reflect.*;
import java.util.*;

/**
 * @ClassName ArrayMaker
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * 
 */
public class ArrayMaker<T> {
	private Class<T> kind;
	public ArrayMaker(Class<T> kind){ this.kind = kind; }
	@SuppressWarnings("unchecked")
	T[] create(int size){
		// 泛型中创建数组，使用Array.newInstance()是推荐的方式
		return (T[])Array.newInstance(kind, size);
	}
	public static void main(String[] args) {
		ArrayMaker<String> stringMaker = new ArrayMaker<String>(String.class);
		String[] stringArray = stringMaker.create(9);
		System.out.println(Arrays.toString(stringArray));
	}
}

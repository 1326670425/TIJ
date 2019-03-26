/**
 * @Title GenericArrayWithTypeToken.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * @version 1.0
 */
package ch15;
import java.lang.reflect.*;
/**
 * @ClassName GenericArrayWithTypeToken
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * 
 */
public class GenericArrayWithTypeToken<T> {
	private T[] array;
	@SuppressWarnings("unchecked")
	public GenericArrayWithTypeToken(Class<T> type, int sz){
		array = (T[])Array.newInstance(type, sz);
	}
	public void put(int index, T item){
		array[index] = item;
	}
	public T get(int index){ return array[index]; }
	// Expose the underlying representation
	public T[] rep(){ return array; }
	public static void main(String[] args) {
		GenericArrayWithTypeToken<Integer> gai = new GenericArrayWithTypeToken<Integer>(Integer.class, 10);
		Integer[] ia = gai.rep();
	}
}

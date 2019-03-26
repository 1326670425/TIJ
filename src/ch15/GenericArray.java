/**
 * @Title GenericArray.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName GenericArray
 * @Description 由于擦除机制，数组的运行时类型只能是Object[]
 * @author 吴扬颉
 * @date 2019年3月26日
 * 
 */
public class GenericArray<T> {
	private T[] array;
	@SuppressWarnings("unchecked")
	public GenericArray(int sz){
		array = (T[])new Object[sz];
	}
	public void put(int index, T item){
		array[index] = item;
	}
	public T get(int index){ return array[index]; }
	// Method that exposes the underlying representation
	public T[] rep(){ return array; }
	public static void main(String[] args) {
		GenericArray<Integer> gai = new GenericArray<Integer>(10);
		// This causes a ClassCastException
		// Integer[] ia = gai.rep();
		Object[] oa = gai.rep();
	}
}

/**
 * @Title ArrayOfGenericType.java
 * @Package ch16
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月29日
 * @version 1.0
 */
package ch16;

/**
 * @ClassName ArrayOfGenericType
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月29日
 * 
 */
public class ArrayOfGenericType<T> {
	T[] array;
	@SuppressWarnings("unchecked")
	public ArrayOfGenericType(int size){
		// array = new T[size]; // Illegal
		array = (T[])new Object[size]; // "Unchecked" warning
	}
	// Illegal
	// public <U> U[] makeArray(){ return new U[size]; }
}

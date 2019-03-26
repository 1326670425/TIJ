/**
 * @Title GenericArray.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName GenericArray
 * @Description ���ڲ������ƣ����������ʱ����ֻ����Object[]
 * @author �����
 * @date 2019��3��26��
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

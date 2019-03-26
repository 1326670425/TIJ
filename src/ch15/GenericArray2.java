/**
 * @Title GenericArray2.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName GenericArray2
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * 
 */
public class GenericArray2<T> {
	private Object[] array;
	public GenericArray2(int sz){
		array = new Object[sz];
	}
	public void put(int index, T item){
		array[index] = item;
	}
	@SuppressWarnings("unchecked")
	public T get(int index){ return (T)array[index]; }
	@SuppressWarnings("unchecked")
	public T[] rep(){
		return (T[])array;
	}
	public static void main(String[] args) {
		GenericArray2<Integer> gai = new GenericArray2<Integer>(10);
		for(int i = 0; i < 10; i++)
			gai.put(i, i);
		for(int i = 0; i < 10; i++)
			System.out.println(gai.get(i) + " ");
		System.out.println();
		try{
			Integer[] ia = gai.rep();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

/**
 * @Title GenericHolder.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName GenericHolder
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * 
 */
public class GenericHolder<T> {
	private T obj;
	public void set(T obj){ this.obj = obj; }
	public T get(){ return obj; }
	public static void main(String[] args) {
		GenericHolder<String> holder = new GenericHolder<String>();
		holder.set("Item");
		String s = holder.get();
		System.out.println(s);
	}
}

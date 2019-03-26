/**
 * @Title GenericHolder.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName GenericHolder
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
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

/**
 * @Title SimpleHolder.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName SimpleHolder
 * @Description 非泛型示例，set()和get()直接存储和生产值，转型是在调用get()时候接受检查的
 * @author 吴扬颉
 * @date 2019年3月26日
 * 
 */
public class SimpleHolder {
	private Object obj;
	public void set(Object obj){ this.obj = obj; }
	public Object get(){ return obj; }
	public static void main(String[] args) {
		SimpleHolder holder = new SimpleHolder();
		holder.set("Item");
		String s = (String)holder.get();
		System.out.println(s);
	}
}

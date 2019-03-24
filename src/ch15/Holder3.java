/**
 * @Title Holder3.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月24日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName Holder3
 * @Description 简单泛型
 * @author 吴扬颉
 * @date 2019年3月24日
 * 
 */
public class Holder3<T> {
	private T a;
	public Holder3(T a){ this.a = a; }
	public void set(T a){ this.a = a; }
	public T get(){ return a; }
	public static void main(String[] args) {
		Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
		
		Automobile a = h3.get();//此处已经无需转型
		// h3.set("Not an Automobile");//error
		// h3.set(1);//error
		
	}
}

/**
 * @Title Holder3.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��24��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName Holder3
 * @Description �򵥷���
 * @author �����
 * @date 2019��3��24��
 * 
 */
public class Holder3<T> {
	private T a;
	public Holder3(T a){ this.a = a; }
	public void set(T a){ this.a = a; }
	public T get(){ return a; }
	public static void main(String[] args) {
		Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
		
		Automobile a = h3.get();//�˴��Ѿ�����ת��
		// h3.set("Not an Automobile");//error
		// h3.set(1);//error
		
	}
}

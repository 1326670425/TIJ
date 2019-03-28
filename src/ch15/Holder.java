/**
 * @Title Holder.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��27��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName Holder
 * @Description TODO
 * @author �����
 * @date 2019��3��27��
 * 
 */
public class Holder<T> {
	private T value;
	public Holder(){}
	public Holder(T val){ value = val; }
	public void set(T val){ value = val; }
	public T get(){ return value; }
	public boolean equals(Object obj){
		return value.equals(obj);
	}
	public static void main(String[] args) {
		Holder<Apple> Apple = new Holder<Apple>(new Apple());
		Apple d = Apple.get();
		Apple.set(d);
		// Holder<Fruit> Fruit = Apple; // ��������ת��
		Holder<? extends Fruit> fruit = Apple;
		Fruit p = fruit.get();
		d = (Apple)fruit.get();//����Object
		System.out.println();
		try{
			Orange c = (Orange)fruit.get();
		}catch(Exception e){
			System.out.println(e);
		}
		// fruit.set(new Apple());
		// fruit.set(new Fruit()); //���ܵ���set()
		System.out.println(fruit.equals(d));
	}
}

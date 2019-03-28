/**
 * @Title GenericWriting.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��27��
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName GenericWriting
 * @Description TODO
 * @author �����
 * @date 2019��3��27��
 * 
 */
public class GenericWriting {
	static <T> void writeExact(List<T> list, T item){
		list.add(item);
	}
	static List<Apple> apples = new ArrayList<Apple>();
	static List<Fruit> fruit = new ArrayList<Fruit>();
	static void f1(){
		writeExact(apples, new Apple());
		// writeExact(fruit, new Apple()); // erro
		// Incompatible type: found Fruit, required Apple
	}
	static <T> void writeWithWildcard(List<? super T> list, T item){
		list.add(item);
	}
	static void f2(){
		writeWithWildcard(apples, new Apple());
		writeWithWildcard(fruit, new Apple());
	}
	public static void main(String[] args) {
		f1();
		f2();
	}
	
}

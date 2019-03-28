/**
 * @Title GenericReading.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��27��
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName GenericReading
 * @Description ? extends���ڶ�ȡ�� ? super����д��
 * @author �����
 * @date 2019��3��27��
 * 
 */
public class GenericReading {
	static <T> T readExact(List<T> list){
		return list.get(0);
	}
	static List<Apple> apples = Arrays.asList(new Apple());
	static List<Fruit> fruit = Arrays.asList(new Fruit());
	static void f1(){
		Apple a = readExact(apples);
		Fruit f = readExact(fruit);
		f = readExact(apples);
	}
	static class Reader<T>{
		T readExact(List<T> list){ return list.get(0); }
	}
	static void f2(){
		Reader<Fruit> fruitReader = new Reader<Fruit>();
		Fruit f = fruitReader.readExact(fruit);
		// Fruit a = fruitReader.readExact(apples); // error
		// readExact(List<Fruit>) can't be applied to (List<Apple>)
	}
	static class CovarianReader<T>{
		T readCovariant(List<? extends T> list){
			return list.get(0);
		}
	}
	static void f3(){
		CovarianReader<Fruit> fruitReader = new CovarianReader<Fruit>();
		Fruit f = fruitReader.readCovariant(fruit);
		Fruit a = fruitReader.readCovariant(apples);
	}
	public static void main(String[] args) {
		f1(); f2(); f3();
	}
}

/**
 * @Title CheckedList.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;
import ch14.pets.*;
import java.util.*;
/**
 * @ClassName CheckedList
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class CheckedList {
	// 该方法表示遗留代码，因为它接受原生的List
	@SuppressWarnings("unchecked")
	static void oldStyleMethod(List probablyDogs){
		probablyDogs.add(new Cat());
	}
	public static void main(String[] args) {
		List<Dog> dogs1 = new ArrayList<Dog>();
		oldStyleMethod(dogs1);
		List<Dog> dogs2 = Collections.checkedList(new ArrayList<Dog>(), Dog.class);
		try{
			oldStyleMethod(dogs2);
		}catch(Exception e){
			System.out.println(e);
		}
		List<Pet> pets = Collections.checkedList(new ArrayList<Pet>(), Pet.class);
		pets.add(new Dog());
		pets.add(new Cat());
	}
}

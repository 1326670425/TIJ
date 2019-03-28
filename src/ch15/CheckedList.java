/**
 * @Title CheckedList.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * @version 1.0
 */
package ch15;
import ch14.pets.*;
import java.util.*;
/**
 * @ClassName CheckedList
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class CheckedList {
	// �÷�����ʾ�������룬��Ϊ������ԭ����List
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

/**
 * @Title MapOfList.java
 * @Package ch11
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * @version 1.0
 */
package ch11;
import java.lang.reflect.Array;
import java.util.*;
import ch14.pets.*;
/**
 * @ClassName MapOfList
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * 
 */
public class MapOfList {
	public static Map<Person, List<? extends Pet>>
		petPeople = new HashMap<Person, List<? extends Pet>>();
	static{
		petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
		petPeople.put(new Person("Kate"), Arrays.asList(new Cat("Shackleton"), new Cat("Elsie May"), new Dog("Margrett")));
		petPeople.put(new Person("Marilyn"), Arrays.asList(new Pug("pug"), new Cat("cat")));
	}
	public static void main(String[] args) {
		System.out.println("People: " + petPeople.keySet());
		System.out.println("Pets: " + petPeople.values());
		for(Person person : petPeople.keySet()){
			System.out.println(person + " has: ");
			for(Pet pet : petPeople.get(person))
				System.out.println(" " + pet);
		}
	}
}

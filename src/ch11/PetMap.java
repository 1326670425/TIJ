/**
 * @Title PetMap.java
 * @Package ch11
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * @version 1.0
 */
package ch11;
import java.util.*;
import ch14.pets.*;
/**
 * @ClassName PetMap
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * 
 */
public class PetMap {
	public static void main(String[] args) {
		Map<String, Pet> petMap = new HashMap<String, Pet>();
		petMap.put("My Cat", new Cat("Molly"));
		petMap.put("My Dog", new Dog("Ginger"));
		petMap.put("My Hamster", new Hamster("Bosco"));
		System.out.println(petMap);
		Pet dog = petMap.get("My Dog");
		System.out.println(dog);
		System.out.println(petMap.containsKey("My Dog"));
		System.out.println(petMap.containsValue(dog));
	}
}

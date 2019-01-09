/**
 * @Title Pets.java
 * @Package ch14.pets
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * @version 1.0
 */
package ch14.pets;
import java.util.*;
/**
 * @ClassName Pets
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * 
 */
public class Pets {
	public static final PetCreator creator = 
			new LiteralPetCreator();
	public static Pet randomPet(){
		return creator.randomPet();
	}
	public static Pet[] createArray(int size){
		return creator.createArray(size);
	}
	public static ArrayList<Pet> arrayList(int size){
		return creator.arrayList(size);
	}
}

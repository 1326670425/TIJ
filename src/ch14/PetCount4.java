/**
 * @Title PetCount4.java
 * @Package ch14
 * @Description TODO
 * @author �����
 * @date 2019��3��23��
 * @version 1.0
 */
package ch14;
import ch14.pets.*;
/**
 * @ClassName PetCount4
 * @Description TODO
 * @author �����
 * @date 2019��3��23��
 * 
 */
public class PetCount4 {
	public static void main(String[] args) {
		TypeCounter counter = new TypeCounter(Pet.class);
		for(Pet pet : Pets.createArray(20)){
			System.out.print(pet.getClass().getSimpleName() + " ");
			counter.count(pet);
		}
		System.out.println();
		System.out.println(counter);
	}
}

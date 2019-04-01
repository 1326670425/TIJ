/**
 * @Title IndividualTest.java
 * @Package ch17
 * @Description TODO
 * @author �����
 * @date 2019��3��31��
 * @version 1.0
 */
package ch17;
import ch11.MapOfList;
import ch14.pets.*;
import java.util.*;
/**
 * @ClassName IndividualTest
 * @Description TODO
 * @author �����
 * @date 2019��3��31��
 * 
 */
public class IndividualTest {
	public static void main(String[] args) {
		Set<Individual> pets = new TreeSet<Individual>();
		for(List<? extends Pet> lp : MapOfList.petPeople.values())
			for(Pet p : lp)
				pets.add(p);
		System.out.println(pets);
	}
}

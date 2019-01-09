/**
 * @Title LiteralPetCreator.java
 * @Package ch14.pets
 * @Description TODO
 * @author �����
 * @date 2019��1��9��
 * @version 1.0
 */
package ch14.pets;

import java.util.*;
/**
 * @ClassName LiteralPetCreator
 * @Description TODO
 * @author �����
 * @date 2019��1��9��
 * 
 */
public class LiteralPetCreator extends PetCreator{
	@SuppressWarnings("unchecked")
	public static final List<Class<? extends Pet>> allTypes = 
		Collections.unmodifiableList(Arrays.asList(
				Pet.class, Dog.class, Cat.class, Rodent.class,
				Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
				Cymric.class, Rat.class, Mouse.class, Hamster.class
				));
	private static final List<Class<? extends Pet>> types = 
			allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
	public List<Class<? extends Pet>> types(){
		return types;
	}
	public static void main(String[] args){
		System.out.println(types);
	}
}

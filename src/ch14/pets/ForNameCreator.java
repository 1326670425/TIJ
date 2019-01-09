/**
 * @Title ForNameCreator.java
 * @Package ch14.pets
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * @version 1.0
 */
package ch14.pets;
import java.util.*;
/**
 * @ClassName ForNameCreator
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * 
 */
public class ForNameCreator extends PetCreator{
	private static List<Class<? extends Pet>> types = 
			new ArrayList<Class<? extends Pet>>();
	private static String[] typeNames = {
		"ch14.pets.Mutt",
		"ch14.pets.Pug",
		"ch14.pets.EgyptianMau",
		"ch14.pets.Manx",
		"ch14.pets.Cymric",
		"ch14.pets.Rat",
		"ch14.pets.Mouse",
		"ch14.pets.Hamster"
	};
	@SuppressWarnings("unchecked")
	private static void loader(){
		try{
			for(String name : typeNames){
				types.add(
						(Class<? extends Pet>)Class.forName(name));
			}
		}catch(ClassNotFoundException e){
			throw new RuntimeException(e);
		}
	}
	static{ loader(); }
	public List<Class<? extends Pet>> types() { return types; }
}

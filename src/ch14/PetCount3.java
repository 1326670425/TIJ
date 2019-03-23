/**
 * @Title PetCount3.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月23日
 * @version 1.0
 */
package ch14;
import java.util.*;
import ch14.pets.*;
/**
 * @ClassName PetCount3
 * @Description Class.isInstance方法提供了一种动态测试对象的途径
 * @author 吴扬颉
 * @date 2019年3月23日
 * 
 */
public class PetCount3 {
	static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer>{
		public PetCounter(){
			for(Class<? extends Pet> p : LiteralPetCreator.allTypes){
				if(!containsKey(p))
					put(p, 0);
				else
					put(p, get(p).intValue() + 1);
			}
		}
		public void count(Pet pet){
			for(Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()){
				if(pair.getKey().isInstance(pet))
					put(pair.getKey(), pair.getValue() + 1);
			}
		}
		public String toString(){
			StringBuilder result = new StringBuilder("{");
			for(Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()){
				result.append(pair.getKey().getSimpleName());
				result.append("=");
				result.append(pair.getValue());
				result.append(", ");
			}
			//去除后边多余的", "两个字符
			result.delete(result.length() - 2, result.length());
			result.append("}");
			return result.toString();
		}
		public static void main(String[] args) {
			PetCounter petCount = new PetCounter();
			for (Pet pet : Pets.createArray(20)) {
				System.out.print(pet.getClass().getSimpleName() + " ");
				petCount.count(pet);
			}
			System.out.println();
			System.out.println(petCount);
		}
	}
}

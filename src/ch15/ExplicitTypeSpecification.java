/**
 * @Title ExplicitTypeSpecification.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月25日
 * @version 1.0
 */
package ch15;
import ch14.pets.*;
import java.util.*;
/**
 * @ClassName ExplicitTypeSpecification
 * @Description 泛型方法中可以显式指明类型。如果是在定义该方法的类的内部，必须在点操作符之前使用this关键字。如果是使用static方法，必须在点操作符之前加上类名
 * @author 吴扬颉
 * @date 2019年3月25日
 * 
 */
public class ExplicitTypeSpecification {
	static void f(Map<Person, List<Pet>> petPeople) { System.out.println(petPeople.getClass().getName()); }
	public static void main(String[] args) {
		f(New.<Person, List<Pet>>map());
	}
}

/**
 * @Title SuperTypeWildcards.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月27日
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName SuperTypeWildcards
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月27日
 * 
 */
public class SuperTypeWildcards {
	static void writeTo(List<? super Apple> apples){
		apples.add(new Apple());
		apples.add(new Jonathan());
		// apples.add(new Fruit());
	}
}

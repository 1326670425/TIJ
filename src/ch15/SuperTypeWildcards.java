/**
 * @Title SuperTypeWildcards.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��27��
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName SuperTypeWildcards
 * @Description TODO
 * @author �����
 * @date 2019��3��27��
 * 
 */
public class SuperTypeWildcards {
	static void writeTo(List<? super Apple> apples){
		apples.add(new Apple());
		apples.add(new Jonathan());
		// apples.add(new Fruit());
	}
}

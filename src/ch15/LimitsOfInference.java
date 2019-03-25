/**
 * @Title LimitsOfInference.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月25日
 * @version 1.0
 */
package ch15;
import java.util.*;
import ch14.pets.*;
/**
 * @ClassName LimitsOfInference
 * @Description Thinking in Java：类型推断只对赋值操作有效，其他时候不起作用，比如不能用于参数传递，编译错误
 * <p>Java 8下可以编译通过
 * @author 吴扬颉
 * @date 2019年3月25日
 * 
 */
public class LimitsOfInference {
	static void f(Map<Person, List<? extends Pet>> petPeople) { System.out.println(petPeople.getClass().getName()); }
	public static void main(String[] args) {
		f(New.map());
	}
}

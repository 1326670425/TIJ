/**
 * @Title OptionalFilter.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

/**
 * @ClassName OptionalFilter
 * @Description Optional�������
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class OptionalFilter {
	static String[] elements = {"Foo", "", "Bar", "Baz", "Bingo"};
	static Stream<String> testStream() {
		return Arrays.stream(elements);
	}
	static void test(String descr, Predicate<String> pred) {
		System.out.println(" ---( " + descr + " )--- ");
		for(int i = 0; i <= elements.length; i++) {
			System.out.println(
					testStream()
						.skip(i)
						.findFirst()
						.filter(pred));
		}
	}
	public static void main(String[] args) {
		test("true", str -> true);
		test("false", str -> false);
		test(" str != \"\"", str -> str != "");
		test("str.length() == 3", str -> str.length() == 3);
		test("startsWith(\"B\")", str -> str.startsWith("B"));
	}
}

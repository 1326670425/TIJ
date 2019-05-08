/**
 * @Title FunctionMap.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

/**
 * @ClassName FunctionMap
 * @Description map()的应用
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
class FunctionMap {
	static String[] elements = {"12", "", "23", "45"};
	static Stream<String> testStream() {
		return Arrays.stream(elements);
	}
	static void test(String descr, Function<String, String> func) {
		System.out.println("---( " + descr + " )---");
		testStream().map(func).forEach(System.out::println);
	}
	public static void main(String[] args) {
		test("add brackets", s -> "[" + s + "]");
		test("Increments", s -> {
			try {
				return Integer.parseInt(s) + 1 + "";
			}catch(NumberFormatException e) {
				return s;
			}
		});
		test("Replace", s -> s.replace("2", "9"));
		test("Take last digit", s -> s.length() > 0 ? 
				s.charAt(s.length() - 1) + "" : s);
	}
}

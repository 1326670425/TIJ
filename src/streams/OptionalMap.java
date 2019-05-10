/**
 * @Title OptionalMap.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @ClassName OptionalMap
 * @Description Optional.map()函数仅在Optional不为空时才映射函数。
 * 它还将Optional的内容提取到映射函数
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class OptionalMap {
	static String[] elements = {"12", "", "23", "45"};
	static Stream<String> testStream() {
		return Arrays.stream(elements);
	}
	
	static void test(String descr, Function<String, String> func) {
		System.out.println(" ---( " + descr + " )--- ");
		for(int i = 0; i <= elements.length; i++) {
			System.out.println(
					testStream()
						.skip(i)
						.findFirst()// 产生一个Optional
						.map(func));
		}
	}
	
	public static void main(String[] args) {
		test("Add brackets", s -> "[" + s + "]");
		test("Increment", s ->{
			try {
				return Integer.parseInt(s) + 1 + "";
			} catch(NumberFormatException e) {
				return s;
			}
		});
		test("Replace", s -> s.replace("2", "9"));
		test("Take last digit", s -> s.length() > 0 ?
				s.charAt(s.length() - 1) + "" : s);
	}
}

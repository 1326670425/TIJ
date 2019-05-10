/**
 * @Title OptionalFlatMap.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @ClassName OptionalFlatMap
 * @Description Optional的flagMap()函数应用于已经生成Optional的映射函数，
 * 所以它不会像map()那样将结果封装在Optional中
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class OptionalFlatMap {
	static String[] elements = {"12", "", "23", "45"};
	static Stream<String> testStream() {
		return Arrays.stream(elements);
	}
	
	static void test(String descr, Function<String, Optional<String>> func) {
		System.out.println(" ---( " + descr + " )--- ");
		for(int i = 0; i <= elements.length; i++) {
			System.out.println(
					testStream()
						.skip(i)
						.findFirst()// 产生一个Optional
						.flatMap(func));
		}
	}

	public static void main(String[] args) {
		test("Add brackets", s -> Optional.of("[" + s + "]"));
		test("Increment", s ->{
			try {
				return Optional.of(Integer.parseInt(s) + 1 + "");
			} catch(NumberFormatException e) {
				return Optional.of(s);
			}
		});
		test("Replace", s -> Optional.of(s.replace("2", "9")));
		test("Take last digit", s -> Optional.of(
				s.length() > 0 ? s.charAt(s.length() - 1) + "" : s));
	}
}

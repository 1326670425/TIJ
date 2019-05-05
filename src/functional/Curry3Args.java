/**
 * @Title Curry3Args.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName Curry3Args
 * @Description 柯里化一个三参数函数
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class Curry3Args {
	public static void main(String[] args) {
		Function<String, 
			Function<String, 
				Function<String, String>>> sum = 
					a -> b -> c -> a + b + c;
		Function<String, 
			Function<String, String>> hi = sum.apply("Hi ");
		Function<String, String> ho = hi.apply("Ho ");
		System.out.println(ho.apply("Hup"));
	}
}

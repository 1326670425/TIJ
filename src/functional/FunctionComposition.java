/**
 * @Title FunctionComposition.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName FunctionComposition
 * @Description 函数组合
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class FunctionComposition {
	static Function<String, String> f1 = s -> {
		System.out.println(s);
		return s.replace('A', '_');
	},
	f2 = s -> s.substring(3),
	f3 = s -> s.toLowerCase(),
	// f1调用之前，调用f2，f1调用之后，调用f3
	f4 = f1.compose(f2).andThen(f3);
	public static void main(String[] args) {
		System.out.println(f4.apply("GO AFTER ALL AMBULANCES"));
	}
}

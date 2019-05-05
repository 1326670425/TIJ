/**
 * @Title CurryingAndPartials.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName CurryingAndPartials
 * @Description 柯里化(Currying)和部分求值
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class CurryingAndPartials {
	// 未柯里化
	static String uncurried(String a, String b) {
		return a + b;
	}
	public static void main(String[] args) {
		// 柯里化的函数
		Function<String, Function<String, String>> sum = 
				a -> b -> a + b;
		System.out.println(uncurried("Hi ", "Ho"));
		
		// 柯里化的目的是能够通过提供一个参数来创建一个新函数，所以现在有了一个带参函数和剩下的
		// 无参函数、实际上，你能从一个双参数函数开始，最后得到一个单参数函数
		Function<String, String> hi = sum.apply("Hi ");
		System.out.println(hi.apply("Ho"));
		
		// 部分应用
		Function<String, String> sumHi = sum.apply("Hup ");
		System.out.println(sumHi.apply("Ho"));
		System.out.println(sumHi.apply("Hey"));
	}
}

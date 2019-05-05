/**
 * @Title ProduceFunction.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.function.*;

// 使用继承，为专用接口创建别名
interface FuncSS extends Function<String, String> {}

/**
 * @ClassName ProduceFunction
 * @Description Higher-order Function：生产或消费函数的函数
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class ProduceFunction {
	// 使用Lambda表达式，在方法中创建和返回一个函数
	static FuncSS produce() {
		return s -> s.toLowerCase();
	}
	public static void main(String[] args) {
		FuncSS f = produce();
		System.out.println(f.apply("YELLING"));
	}
}

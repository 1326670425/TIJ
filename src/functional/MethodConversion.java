/**
 * @Title MethodConversion.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;
import java.util.function.*;

class In1 {}
class In2 {}

/**
 * @ClassName MethodConversion
 * @Description 方法引用，Function接口
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class MethodConversion {
	static void accept(In1 i1, In2 i2) {
		System.out.println("accept()");
	}
	static void someOtherName(In1 i1, In2 i2) {
		System.out.println("someOtherName()");
	}
	public static void main(String[] args) {
		BiConsumer<In1, In2> bic;
		
		bic = MethodConversion::accept;
		bic.accept(new In1(), new In2());
		// 在使用函数接口时，名称不重要，只要参数类型和返回类型相同。Java会完成映射。
		// 但是调用要用接口的函数式方法，而不是你的方法名
		bic = MethodConversion::someOtherName;
		// bic.someOtherName(new In1(), new In2());
		bic.accept(new In1(), new In2());
	}
}

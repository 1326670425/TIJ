/**
 * @Title CurriedIntAdd.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName CurriedIntAdd
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class CurriedIntAdd {
	public static void main(String[] args) {
		IntFunction<IntUnaryOperator> curriedIntAdd = a -> b -> a + b;
		IntUnaryOperator add4 = curriedIntAdd.apply(4);
		System.out.println(add4.applyAsInt(5));
	}
}

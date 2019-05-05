/**
 * @Title CurriedIntAdd.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName CurriedIntAdd
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class CurriedIntAdd {
	public static void main(String[] args) {
		IntFunction<IntUnaryOperator> curriedIntAdd = a -> b -> a + b;
		IntUnaryOperator add4 = curriedIntAdd.apply(4);
		System.out.println(add4.applyAsInt(5));
	}
}

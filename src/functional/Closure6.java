/**
 * @Title Closure6.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName Closure6
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class Closure6 {
	IntSupplier makeFun(int x) {
		int i = 0;
		i++;
		x++;
		final int iFinal = i;
		final int xFinal = x;
		return () -> xFinal + iFinal;
	}
}

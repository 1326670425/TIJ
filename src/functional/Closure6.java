/**
 * @Title Closure6.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName Closure6
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
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

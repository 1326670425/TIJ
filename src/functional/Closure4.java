/**
 * @Title Closure4.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName Closure4
 * @Description 实际final效果
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class Closure4 {
	IntSupplier makeFun(int x) {
		final int i = 0;
		return () -> x + i;
	}
}

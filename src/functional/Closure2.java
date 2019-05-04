/**
 * @Title Closure2.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName Closure2
 * @Description i为局部变量。等同final效果（Effective Final）：虽然
 * 没有明确声明变量为final的，但是因为变量值永远不会改变，实际效果是final
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class Closure2 {
	IntSupplier makeFun(int x) {
		int i = 0;
		return () -> x + i;
	}
}

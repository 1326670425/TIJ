/**
 * @Title Closure3.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName Closure3
 * @Description Lambda表达式引用的局部变量都是final的或者是final效果的。
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class Closure3 {
	IntSupplier makeFun(int x) {
		int i = 0;
		//return () -> x++ + i++;
		return () -> x + i;
	}
}

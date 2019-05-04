/**
 * @Title Closure7.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName Closure7
 * @Description 即使是基本类型的包装类，编译器也能识别出来其值在被修改。
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class Closure7 {
	IntSupplier makeFun(int x) {
		Integer i = 0;
		// 错误
		// i = i + 1;
		return () -> x + i;
	}
}

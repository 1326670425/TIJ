/**
 * @Title Closure5.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName Closure5
 * @Description 局部变量不在返回值处修改仍是错误的
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class Closure5 {
	IntSupplier makeFun(int x) {
		int i = 0;
		// 报错
		// i++;
		// x++;
		return () -> x + i;
	}
}

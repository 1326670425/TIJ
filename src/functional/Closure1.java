/**
 * @Title Closure1.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName Closure1
 * @Description 闭包
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class Closure1 {
	int i;
	IntSupplier makeFun(int x) {
		return () -> x + i++;
	}
}

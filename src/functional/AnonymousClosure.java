/**
 * @Title AnonymousClosure.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName AnonymousClosure
 * @Description 闭包之匿名内部类
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class AnonymousClosure {
	IntSupplier makeFun(int x) {
		int i = 0;
		// i++;
		// x++;
		return new IntSupplier() {
			public int getAsInt() { return x + i; }
		};
	}
}

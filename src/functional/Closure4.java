/**
 * @Title Closure4.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName Closure4
 * @Description ʵ��finalЧ��
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class Closure4 {
	IntSupplier makeFun(int x) {
		final int i = 0;
		return () -> x + i;
	}
}

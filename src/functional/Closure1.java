/**
 * @Title Closure1.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName Closure1
 * @Description �հ�
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class Closure1 {
	int i;
	IntSupplier makeFun(int x) {
		return () -> x + i++;
	}
}

/**
 * @Title Closure5.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName Closure5
 * @Description �ֲ��������ڷ���ֵ���޸����Ǵ����
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class Closure5 {
	IntSupplier makeFun(int x) {
		int i = 0;
		// ����
		// i++;
		// x++;
		return () -> x + i;
	}
}

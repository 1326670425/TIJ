/**
 * @Title Closure7.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName Closure7
 * @Description ��ʹ�ǻ������͵İ�װ�࣬������Ҳ��ʶ�������ֵ�ڱ��޸ġ�
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class Closure7 {
	IntSupplier makeFun(int x) {
		Integer i = 0;
		// ����
		// i = i + 1;
		return () -> x + i;
	}
}

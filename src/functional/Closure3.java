/**
 * @Title Closure3.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName Closure3
 * @Description Lambda���ʽ���õľֲ���������final�Ļ�����finalЧ���ġ�
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class Closure3 {
	IntSupplier makeFun(int x) {
		int i = 0;
		//return () -> x++ + i++;
		return () -> x + i;
	}
}

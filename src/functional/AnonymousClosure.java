/**
 * @Title AnonymousClosure.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName AnonymousClosure
 * @Description �հ�֮�����ڲ���
 * @author �����
 * @date 2019��5��3��
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

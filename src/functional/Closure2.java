/**
 * @Title Closure2.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName Closure2
 * @Description iΪ�ֲ���������ͬfinalЧ����Effective Final������Ȼ
 * û����ȷ��������Ϊfinal�ģ�������Ϊ����ֵ��Զ����ı䣬ʵ��Ч����final
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class Closure2 {
	IntSupplier makeFun(int x) {
		int i = 0;
		return () -> x + i;
	}
}

/**
 * @Title FunctionWithWrapped.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName FunctionWithWrapped
 * @Description ʹ�ð�װ����
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class FunctionWithWrapped {
	public static void main(String[] args) {
		Function<Integer, Double> fid = i -> (double)i;
		IntToDoubleFunction fid2 = i -> i;
	}
}

/**
 * @Title Closure9.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.*;
import java.util.function.*;

/**
 * @ClassName Closure9
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class Closure9 {
	Supplier<List<Integer>> makeFun() {
		List<Integer> ai = new ArrayList<>();
		// �����ٸ�ֵ
		// ai = new ArrayList<>();
		return () -> ai;
	}
}

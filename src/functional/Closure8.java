/**
 * @Title Closure8.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.*;
import java.util.function.*;

/**
 * @ClassName Closure8
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class Closure8 {
	Supplier<List<Integer>> makeFun() {
		final List<Integer> ai = new ArrayList();
		ai.add(1);
		return () -> ai;
	}
	public static void main(String[] args) {
		Closure8 c7 = new Closure8();
		List<Integer>
			l1 = c7.makeFun().get(),
			l2 = c7.makeFun().get();
		System.out.println(l1);
		System.out.println(l2);
		l1.add(42);
		l2.add(96);
		System.out.println(l1);
		System.out.println(l2);
	}
}

/**
 * @Title FunctionComposition.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName FunctionComposition
 * @Description �������
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class FunctionComposition {
	static Function<String, String> f1 = s -> {
		System.out.println(s);
		return s.replace('A', '_');
	},
	f2 = s -> s.substring(3),
	f3 = s -> s.toLowerCase(),
	// f1����֮ǰ������f2��f1����֮�󣬵���f3
	f4 = f1.compose(f2).andThen(f3);
	public static void main(String[] args) {
		System.out.println(f4.apply("GO AFTER ALL AMBULANCES"));
	}
}

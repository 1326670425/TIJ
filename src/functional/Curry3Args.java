/**
 * @Title Curry3Args.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName Curry3Args
 * @Description ���ﻯһ������������
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class Curry3Args {
	public static void main(String[] args) {
		Function<String, 
			Function<String, 
				Function<String, String>>> sum = 
					a -> b -> c -> a + b + c;
		Function<String, 
			Function<String, String>> hi = sum.apply("Hi ");
		Function<String, String> ho = hi.apply("Ho ");
		System.out.println(ho.apply("Hup"));
	}
}

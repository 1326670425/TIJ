/**
 * @Title ParameterizedArrayType.java
 * @Package ch16
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月29日
 * @version 1.0
 */
package ch16;

import java.lang.reflect.Method;

class ClassParameter<T>{
	public T[] f(T[] arg){ return arg; }
}

class MethodParameter{
	public static <T> T[] f(T[] arg){ return arg; }
}

/**
 * @ClassName ParameterizedArrayType
 * @Description 数组与泛型
 * <p>不能实例化具有参数类型的数组：Peel<Banana>[] peels = new Peel<Banana>[10]; // Illegal
 * <p>但是可以参数化数组本身的类型
 * @author 吴扬颉
 * @date 2019年3月29日
 * 
 */
public class ParameterizedArrayType {
	public static void main(String[] args) {
		Integer[] ints = {1, 2, 3, 4, 5};
		Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
		Integer[] ints2 = new ClassParameter<Integer>().f(ints);
		Double[] doubles2 = new ClassParameter<Double>().f(doubles);
		/*
		 * 使用参数化方法而不使用参数化类的方便之处在于：不必为需要应用的每种不同类型都使用一个参数去实例化这个类，而且可以将其定义为静态的。
		 */
		ints2 = MethodParameter.f(ints);
		doubles2 = MethodParameter.f(doubles);
	}
}

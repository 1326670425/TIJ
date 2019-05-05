/**
 * @Title SharedStorage.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName SharedStorage
 * @Description 闭包应用中，同一对象多次调用makeFun()，会得到多个函数，共享 i
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class SharedStorage {
	public static void main(String[] args) {
		Closure1 c1 = new Closure1();
		IntSupplier f1 = c1.makeFun(0);
		IntSupplier f2 = c1.makeFun(0);
		IntSupplier f3 = c1.makeFun(0);
		System.out.println(f1.getAsInt());
		System.out.println(f2.getAsInt());
		System.out.println(f3.getAsInt());
	}
}

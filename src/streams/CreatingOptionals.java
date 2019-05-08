/**
 * @Title CreatingOptionals.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

/**
 * @ClassName CreatingOptionals
 * @Description 创建Optional
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class CreatingOptionals {
	static void test(String testName, Optional<String> opt) {
		System.out.println(" === " + testName + " === ");
		System.out.println(opt.orElse("Null"));
	}
	public static void main(String[] args) {
		test("empty", Optional.empty());
		test("of", Optional.of("Howdy"));
		try {
			// 试图用null生成Optional对象则会抛出异常
			test("of", Optional.of(null));
		} catch(Exception e) {
			System.out.println(e);
		}
		// ofNullable(value)：不确定是否为空，为空时自动生成Optional.empty
		// 否则将值包装在Optional中
		test("ofNullable", Optional.ofNullable("Hi"));
		// ofNullable()会很好地处理null
		test("ofNullable", Optional.ofNullable(null));
	}
}

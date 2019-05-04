/**
 * @Title Closure9.java
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
 * @ClassName Closure9
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class Closure9 {
	Supplier<List<Integer>> makeFun() {
		List<Integer> ai = new ArrayList<>();
		// 错误，再赋值
		// ai = new ArrayList<>();
		return () -> ai;
	}
}

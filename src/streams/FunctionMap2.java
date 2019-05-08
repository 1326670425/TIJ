/**
 * @Title FunctionMap2.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;

class Numbered {
	final int n;
	Numbered(int n) {
		this.n = n;
	}
	@Override
	public String toString() {
		return "Numbered(" + n + ")";
	}
}

/**
 * @ClassName FunctionMap2
 * @Description map()映射不同类型
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class FunctionMap2 {
	public static void main(String[] args) {
		Stream.of(1, 5, 7, 9, 11, 13)
			.map(Numbered::new)
			.forEach(System.out::println);
	}
}

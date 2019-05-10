/**
 * @Title OptionalBasic.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;

/**
 * @ClassName OptionalBasic
 * @Description Optional用法
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class OptionalBasic {
	static void test(Optional<String> optString) {
		// 检查其中是否有元素
		if(optString.isPresent())
			System.out.println(optString.get());
		else
			System.out.println("Nothing inside!");
	}
	public static void main(String[] args) {
		test(Stream.of("Epithets").findFirst());
		test(Stream.<String>empty().findFirst());
	}
}

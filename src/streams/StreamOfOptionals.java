/**
 * @Title StreamOfOptionals.java
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
 * @ClassName StreamOfOptionals
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class StreamOfOptionals {
	public static void main(String[] args) {
		Signal.stream().limit(10).forEach(System.out::println);
		System.out.println(" --- ");
		Signal.stream().limit(10).filter(Optional::isPresent)
			.map(Optional::get)
			.forEach(System.out::println);
	}
}

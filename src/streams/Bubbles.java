/**
 * @Title Bubbles.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.stream.*;

/**
 * @ClassName Bubbles
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class Bubbles {
	public static void main(String[] args) {
		Stream.generate(Bubble::bubbler)
			  .limit(5)
			  .forEach(System.out::println);
	}
}

/**
 * @Title Generator.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 * @ClassName Generator
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class Generator implements Supplier<String> {
	Random rand = new Random(47);
	char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	
	public String get() {
		return "" + letters[rand.nextInt(letters.length)];
	}
	
	public static void main(String[] args) {
		String word = Stream.generate(new Generator())
							.limit(30)
							.collect(Collectors.joining());
		System.out.println(word);
	}
}

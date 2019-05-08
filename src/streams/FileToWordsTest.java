/**
 * @Title FileToWordsTest.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.stream.*;

/**
 * @ClassName FileToWordsTest
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class FileToWordsTest {
	public static void main(String[] args) throws Exception {
		FileToWords.stream("src/streams/Cheese.dat")
			.limit(7)
			.forEach(s -> System.out.format("%s ", s));
		System.out.println();
		FileToWords.stream("src/streams/Cheese.dat")
			.skip(7)
			.limit(2)
			.forEach(s -> System.out.format("%s ", s));
	}
}

/**
 * @Title FileToWordsTest.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.stream.*;

/**
 * @ClassName FileToWordsTest
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
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

/**
 * @Title Informational.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月5日
 * @version 1.0
 */
package streams;

import java.util.stream.*;
import java.util.function.*;

/**
 * @ClassName Informational
 * @Description 流中信息
 * @author 吴扬颉
 * @date 2019年5月5日
 * 
 */
public class Informational {
	public static void main(String[] args) throws Exception {
		System.out.println(FileToWords.stream("src/streams/Cheese.dat").count());
		System.out.println(FileToWords.stream("src/streams/Cheese.dat").min(String.CASE_INSENSITIVE_ORDER).orElse("NONE"));
		System.out.println(FileToWords.stream("src/streams/Cheese.dat").max(String.CASE_INSENSITIVE_ORDER).orElse("NONE"));
	}
}

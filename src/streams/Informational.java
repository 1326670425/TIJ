/**
 * @Title Informational.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��5��
 * @version 1.0
 */
package streams;

import java.util.stream.*;
import java.util.function.*;

/**
 * @ClassName Informational
 * @Description ������Ϣ
 * @author �����
 * @date 2019��5��5��
 * 
 */
public class Informational {
	public static void main(String[] args) throws Exception {
		System.out.println(FileToWords.stream("src/streams/Cheese.dat").count());
		System.out.println(FileToWords.stream("src/streams/Cheese.dat").min(String.CASE_INSENSITIVE_ORDER).orElse("NONE"));
		System.out.println(FileToWords.stream("src/streams/Cheese.dat").max(String.CASE_INSENSITIVE_ORDER).orElse("NONE"));
	}
}

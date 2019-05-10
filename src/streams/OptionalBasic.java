/**
 * @Title OptionalBasic.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;

/**
 * @ClassName OptionalBasic
 * @Description Optional�÷�
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class OptionalBasic {
	static void test(Optional<String> optString) {
		// ��������Ƿ���Ԫ��
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

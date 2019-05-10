/**
 * @Title OptionalsFromEmptyStreams.java
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
 * @ClassName OptionalsFromEmptyStreams
 * @Description �Կ�������
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class OptionalsFromEmptyStreams {
	public static void main(String[] args) {
		System.out.println(Stream.<String>empty().findFirst());
		
		System.out.println(Stream.<String>empty().findAny());
		
		System.out.println(Stream.<String>empty().max(String.CASE_INSENSITIVE_ORDER));
		
		System.out.println(Stream.<String>empty().min(String.CASE_INSENSITIVE_ORDER));
		
		System.out.println(Stream.<String>empty().reduce((s1, s2) -> s1 + s2));
		
		System.out.println(IntStream.empty().average());
	}
}

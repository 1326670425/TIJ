/**
 * @Title LastElement.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��5��
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;

/**
 * @ClassName LastElement
 * @Description ʹ��reduce()�����������һ��Ԫ��
 * @author �����
 * @date 2019��5��5��
 * 
 */
public class LastElement {
	public static void main(String[] args) {
		OptionalInt last = IntStream.range(10, 20).reduce((n1, n2) -> n2);
		System.out.println(last.orElse(-1));
		// �����ֶ���
		Optional<String> lastobj = Stream.of("one", "two", "three").reduce((n1, n2) -> n2);
		System.out.println(lastobj.orElse("Nothing there!"));
	}
}

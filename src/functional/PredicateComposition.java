/**
 * @Title PredicateComposition.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;
import java.util.stream.*;

/**
 * @ClassName PredicateComposition
 * @Description Predicate�߼�����
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class PredicateComposition {
	static Predicate<String> 
		p1 = s -> s.contains("bar"),
		p2 = s -> s.length() < 5,
		p3 = s -> s.contains("foo"),
		p4 = p1.negate().and(p2).or(p3);
	public static void main(String[] args) {
		Stream.of("bar", "foobar", "foobaz", "fongopuckey")
			.filter(p4)
			.forEach(System.out::println);
	}
}

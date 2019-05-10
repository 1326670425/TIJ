/**
 * @Title Reduce.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;

class Frobnitz {
	int size;
	Frobnitz(int sz) { size = sz; }
	@Override
	public String toString() {
		return "Frobnitz(" + size + ")";
	}
	static Random rand = new Random(47);
	static final int BOUND = 100;
	static Frobnitz supply() {
		return new Frobnitz(rand.nextInt(BOUND));
	}
}

/**
 * @ClassName Reduce
 * @Description reduce��غ���
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class Reduce {
	public static void main(String[] args) {
		Stream.generate(Frobnitz::supply)
			.limit(10)
			.peek(System.out::println)
			.reduce((fr0, fr1) -> fr0.size < 50 ? fr0 : fr1)
			.ifPresent(System.out::println);
	}
}

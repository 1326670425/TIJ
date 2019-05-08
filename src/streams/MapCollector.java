/**
 * @Title MapCollector.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;

class Pair {
	public final Character c;
	public final Integer i;
	Pair(Character c, Integer i) {
		this.c = c;
		this.i = i;
	}
	public Character getC() { return c; }
	public Integer getI() { return i; }
	@Override
	public String toString() {
		return "Pair(" + c + ", " + i + ")";
	}
}

class RandomPair {
	Random rand = new Random(47);
	Iterator<Character> capChars = rand.ints(65, 91)
									.mapToObj(i -> (char)i)
									.iterator();
	public Stream<Pair> stream() {
		return rand.ints(100, 1000)
				.distinct()
				.mapToObj(i -> new Pair(capChars.next(), i));
	}
}

/**
 * @ClassName MapCollector
 * @Description 流中生成Map
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class MapCollector {
	public static void main(String[] args) {
		Map<Integer, Character> map = new RandomPair().stream().limit(8)
											.collect(Collectors.toMap(Pair::getI, Pair::getC));
		System.out.println(map);
	}
}

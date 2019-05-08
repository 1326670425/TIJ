/**
 * @Title CollectionToStream.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;

/**
 * @ClassName CollectionToStream
 * @Description 集合产生流
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class CollectionToStream {
	public static void main(String[] args) {
		List<Bubble> bubbles = Arrays.asList(new Bubble(1), new Bubble(2), new Bubble(3));
		System.out.println(bubbles.stream()
				.mapToInt(b -> b.i)
				.sum());
		
		Set<String> w = new HashSet<>(Arrays.asList("It's a wonderful day for pie!".split(" ")));
		w.stream()
		 .map(x -> x + " ")
		 .forEach(System.out::print);
		System.out.println();
		
		Map<String, Double> m = new HashMap<>();
		m.put("pi", 3.14159);
		m.put("e", 2.718);
		m.put("phi", 1.618);
		m.entrySet().stream()
					.map(e -> e.getKey() + ": " + e.getValue())
					.forEach(System.out::println);
	}
}

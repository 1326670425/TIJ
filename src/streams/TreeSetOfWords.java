/**
 * @Title TreeSetOfWords.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.*;
import java.nio.file.*;
import java.util.stream.*;

/**
 * @ClassName TreeSetOfWords
 * @Description collect()函数
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class TreeSetOfWords {
	public static void main(String[] args) throws Exception {
		Set<String> words2 = Files.lines(Paths.get("src/streams/Cheese.dat"))
								.flatMap(s -> Arrays.stream(s.split("\\W+")))
								.filter(s -> !s.matches("\\d+")) // 没有数字
								.map(String::trim)
								.filter(s -> s.length() > 2)
								.limit(100)
								.collect(Collectors.toCollection(TreeSet::new));//元素收集到指定集合
		System.out.println(words2);
	}
}

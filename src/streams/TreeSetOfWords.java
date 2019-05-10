/**
 * @Title TreeSetOfWords.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.*;
import java.nio.file.*;
import java.util.stream.*;

/**
 * @ClassName TreeSetOfWords
 * @Description collect()����
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class TreeSetOfWords {
	public static void main(String[] args) throws Exception {
		Set<String> words2 = Files.lines(Paths.get("src/streams/Cheese.dat"))
								.flatMap(s -> Arrays.stream(s.split("\\W+")))
								.filter(s -> !s.matches("\\d+")) // û������
								.map(String::trim)
								.filter(s -> s.length() > 2)
								.limit(100)
								.collect(Collectors.toCollection(TreeSet::new));//Ԫ���ռ���ָ������
		System.out.println(words2);
	}
}

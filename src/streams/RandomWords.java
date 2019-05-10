/**
 * @Title RandomWords.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.io.*;
import java.nio.file.*;

/**
 * @ClassName RandomWords
 * @Description ����RandomΪ������󼯺ϴ���Supplier�����ı��ļ�����ȡString����
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class RandomWords implements Supplier<String>{
	List<String> words = new ArrayList<>();
	Random rand = new Random(47);
	RandomWords(String fname) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(fname));
		// ������һ��
		for (String line : lines.subList(1, lines.size())) {
			for (String word : line.split("[ .?,]+"))
				words.add(word.toLowerCase());
		}
	}
	public String get() {
		return words.get(rand.nextInt(words.size()));
	}
	@Override
	public String toString() {
		return words.stream().collect(Collectors.joining(" "));
	}
	public static void main(String[] args) throws Exception {
		System.out.println(
				Stream.generate(new RandomWords("src/streams/Cheese.dat"))
					.limit(10)
					.collect(Collectors.joining(" ")));
	}
}

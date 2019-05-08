/**
 * @Title FileToWordsBuilder.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

/**
 * @ClassName FileToWordsBuilder
 * @Description ���������ģʽ
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class FileToWordsBuilder {
	Stream.Builder<String> builder = Stream.builder();
	
	public FileToWordsBuilder(String filePath) throws Exception {
		Files.lines(Paths.get(filePath))
			 .skip(1)// ������һ��
			 .forEach(line -> {
				 for (String w : line.split("[ .?,]+"))
					 builder.add(w);
			 });
	}
	
	Stream<String> stream() {
		return builder.build();// ����build()���������������Ԫ���������쳣
	}
	
	public static void main(String[] args) throws Exception{
		new FileToWordsBuilder("src/streams/cheese.dat")
			.stream()
			.limit(7)
			.map(w -> w + " ")
			.forEach(System.out::print);
	}
}

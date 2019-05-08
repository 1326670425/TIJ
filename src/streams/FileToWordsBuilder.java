/**
 * @Title FileToWordsBuilder.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

/**
 * @ClassName FileToWordsBuilder
 * @Description 建造者设计模式
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class FileToWordsBuilder {
	Stream.Builder<String> builder = Stream.builder();
	
	public FileToWordsBuilder(String filePath) throws Exception {
		Files.lines(Paths.get(filePath))
			 .skip(1)// 跳过第一行
			 .forEach(line -> {
				 for (String w : line.split("[ .?,]+"))
					 builder.add(w);
			 });
	}
	
	Stream<String> stream() {
		return builder.build();// 调用build()后，若继续尝试添加元素则会出现异常
	}
	
	public static void main(String[] args) throws Exception{
		new FileToWordsBuilder("src/streams/cheese.dat")
			.stream()
			.limit(7)
			.map(w -> w + " ")
			.forEach(System.out::print);
	}
}

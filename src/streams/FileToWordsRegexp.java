/**
 * @Title FileToWordsRegexp.java
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
import java.util.regex.Pattern;

/**
 * @ClassName FileToWordsRegexp
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class FileToWordsRegexp {
	private String all;
	public FileToWordsRegexp(String filePath) throws Exception {
		all = Files.lines(Paths.get(filePath))
				.skip(1)
				.collect(Collectors.joining(" "));
	}
	public Stream<String> stream() {
		return Pattern.compile("[ .,?]+").splitAsStream(all);
	}
	public static void main(String[] args) throws Exception{
		FileToWordsRegexp fw = new FileToWordsRegexp("src/streams/cheese.dat");
		fw.stream()
		  .limit(7)
		  .map(w -> w + " ")
		  .forEach(System.out::print);
		fw.stream()
		  .skip(7)
		  .limit(2)
		  .map(w -> w + " ")
		  .forEach(System.out::print);
	}
}

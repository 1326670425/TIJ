/**
 * @Title InputFile2.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年8月2日
 * @version 1.0
 */
package ch12;

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

/**
 * @ClassName InputFile2
 * @Description 以流的方式打开文件
 * @author 吴扬颉
 * @date 2019年8月2日
 * 
 */
public class InputFile2 {
	private String fname;
	
	public InputFile2(String fname) {
		this.fname = fname;
	}
	
	public Stream<String> getLines() throws IOException {
		return Files.lines(Paths.get(fname));
	}
	
	public static void main(String[] args) throws IOException{
		new InputFile2("InputFile2.java").getLines()
			.skip(15)
			.limit(1)
			.forEach(System.out::println);
	}
}

/**
 * @Title InputFile2.java
 * @Package ch12
 * @Description TODO
 * @author �����
 * @date 2019��8��2��
 * @version 1.0
 */
package ch12;

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

/**
 * @ClassName InputFile2
 * @Description �����ķ�ʽ���ļ�
 * @author �����
 * @date 2019��8��2��
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

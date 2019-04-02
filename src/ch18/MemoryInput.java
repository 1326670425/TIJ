/**
 * @Title MemoryInput.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月2日
 * @version 1.0
 */
package ch18;
import java.io.*;
/**
 * @ClassName MemoryInput
 * @Description 内存中输入
 * @author 吴扬颉
 * @date 2019年4月2日
 * 
 */
public class MemoryInput {
	public static void main(String[] args) throws IOException{
		StringReader in = new StringReader(BufferedInputFile.read("./src/ch18/DirList.java"));
		int c;
		while((c = in.read()) != -1)
			System.out.println((char)c);
		in.close();
	}
}

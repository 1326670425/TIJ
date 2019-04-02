/**
 * @Title FileOutputShortcut.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * @version 1.0
 */
package ch18;
import java.io.*;
/**
 * @ClassName FileOutputShortcut
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * 
 */
public class FileOutputShortcut {
	static String file = "FileOutputShortcut.out";
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(
				new StringReader(
						BufferedInputFile.read("./src/ch18/DirList.java")
						)
				);
		PrintWriter out = new PrintWriter(file);
		int lineCount = 1;
		String s;
		while((s = in.readLine()) != null)
			out.println(lineCount++ + ": " + s);
		out.close();
		in.close();
		System.out.println(BufferedInputFile.read(file));
	}
}

/**
 * @Title BufferedInputFile.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月2日
 * @version 1.0
 */
package ch18;
import java.io.*;
/**
 * @ClassName BufferedInputFile
 * @Description 缓冲输入文件
 * @author 吴扬颉
 * @date 2019年4月2日
 * 
 */
public class BufferedInputFile {
	public static String read(String filename) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = in.readLine()) != null){
			sb.append(s + "\n");
		}
		in.close();
		return sb.toString();
	}
	public static void main(String[] args) throws IOException{
		System.out.println(read("./src/ch18/DirList.java"));
	}
}

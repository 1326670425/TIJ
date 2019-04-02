/**
 * @Title BufferedInputFile.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * @version 1.0
 */
package ch18;
import java.io.*;
/**
 * @ClassName BufferedInputFile
 * @Description ���������ļ�
 * @author �����
 * @date 2019��4��2��
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

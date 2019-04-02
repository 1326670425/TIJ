/**
 * @Title Echo.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月2日
 * @version 1.0
 */
package ch18;
import java.io.*;
/**
 * @ClassName Echo
 * @Description 从标准输入中读取
 * @author 吴扬颉
 * @date 2019年4月2日
 * 
 */
public class Echo {
	public static void main(String[] args) throws IOException{
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in)
				);
		String s = "init";
		while((s = stdin.readLine()) != null && s.length() != 0)
			System.out.println(s);
		stdin.close();
	}
}

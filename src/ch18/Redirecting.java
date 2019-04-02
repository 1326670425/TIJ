/**
 * @Title Redirecting.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月2日
 * @version 1.0
 */
package ch18;
import java.io.*;
/**
 * @ClassName Redirecting
 * @Description I/O重定向。重定向操纵的是字节流，所以用Stream
 * @author 吴扬颉
 * @date 2019年4月2日
 * 
 */
public class Redirecting {
	public static void main(String[] args) throws IOException{
		PrintStream console = System.out;
		BufferedInputStream in = new BufferedInputStream(
				new FileInputStream(""));
		PrintStream out = new PrintStream(
				new BufferedOutputStream(
						new FileOutputStream("test.out")
						)
				);
		System.setIn(in);
		System.setOut(out);
		System.setErr(out);
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		String s;
		while((s = br.readLine()) != null)
			System.out.println(s);
		out.close();
		System.setOut(console);
	}
}

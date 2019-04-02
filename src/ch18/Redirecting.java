/**
 * @Title Redirecting.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * @version 1.0
 */
package ch18;
import java.io.*;
/**
 * @ClassName Redirecting
 * @Description I/O�ض����ض�����ݵ����ֽ�����������Stream
 * @author �����
 * @date 2019��4��2��
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

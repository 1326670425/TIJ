/**
 * @Title Echo.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * @version 1.0
 */
package ch18;
import java.io.*;
/**
 * @ClassName Echo
 * @Description �ӱ�׼�����ж�ȡ
 * @author �����
 * @date 2019��4��2��
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

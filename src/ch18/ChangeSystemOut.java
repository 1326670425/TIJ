/**
 * @Title ChangeSystemOut.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * @version 1.0
 */
package ch18;
import java.io.*;
/**
 * @ClassName ChangeSystemOut
 * @Description ��Systen.outת����PrintWriter
 * @author �����
 * @date 2019��4��2��
 * 
 */
public class ChangeSystemOut {
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out, true);
		out.println("Hello World");
	}
}

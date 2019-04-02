/**
 * @Title ChangeSystemOut.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月2日
 * @version 1.0
 */
package ch18;
import java.io.*;
/**
 * @ClassName ChangeSystemOut
 * @Description 将Systen.out转换成PrintWriter
 * @author 吴扬颉
 * @date 2019年4月2日
 * 
 */
public class ChangeSystemOut {
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out, true);
		out.println("Hello World");
	}
}

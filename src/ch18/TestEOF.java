/**
 * @Title TestEOF.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月2日
 * @version 1.0
 */
package ch18;
import java.io.*;
/**
 * @ClassName TestEOF
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月2日
 * 
 */
public class TestEOF {
	public static void main(String[] args) throws IOException{
		DataInputStream in = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("./src/ch18/DirList.java")
						)
				);
		// available() 在没有阻塞的情况下所能读取的字节数
		while(in.available() != 0)
			System.out.println((char)in.readByte());
		in.close();
	}
}

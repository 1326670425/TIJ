/**
 * @Title TestEOF.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * @version 1.0
 */
package ch18;
import java.io.*;
/**
 * @ClassName TestEOF
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * 
 */
public class TestEOF {
	public static void main(String[] args) throws IOException{
		DataInputStream in = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("./src/ch18/DirList.java")
						)
				);
		// available() ��û����������������ܶ�ȡ���ֽ���
		while(in.available() != 0)
			System.out.println((char)in.readByte());
		in.close();
	}
}

/**
 * @Title MemoryInput.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * @version 1.0
 */
package ch18;
import java.io.*;
/**
 * @ClassName MemoryInput
 * @Description �ڴ�������
 * @author �����
 * @date 2019��4��2��
 * 
 */
public class MemoryInput {
	public static void main(String[] args) throws IOException{
		StringReader in = new StringReader(BufferedInputFile.read("./src/ch18/DirList.java"));
		int c;
		while((c = in.read()) != -1)
			System.out.println((char)c);
		in.close();
	}
}

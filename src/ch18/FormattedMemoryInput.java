/**
 * @Title FormattedMemoryInput.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * @version 1.0
 */
package ch18;
import java.io.*;
/**
 * @ClassName FormattedMemoryInput
 * @Description ��ʽ�����ڴ�����
 * @author �����
 * @date 2019��4��2��
 * 
 */
public class FormattedMemoryInput {
	public static void main(String[] args) throws IOException{
		try{
			DataInputStream in = new DataInputStream(
					new ByteArrayInputStream(
							BufferedInputFile.read("./src/ch18/DirList.java").getBytes()
							));
			while(true)
				System.out.println((char)in.readByte());
		}catch(EOFException e){
			System.err.println("End of stream");
		}
	}
}

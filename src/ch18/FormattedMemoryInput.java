/**
 * @Title FormattedMemoryInput.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月2日
 * @version 1.0
 */
package ch18;
import java.io.*;
/**
 * @ClassName FormattedMemoryInput
 * @Description 格式化的内存输入
 * @author 吴扬颉
 * @date 2019年4月2日
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

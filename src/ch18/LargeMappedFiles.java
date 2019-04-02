/**
 * @Title LargeMappedFiles.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月2日
 * @version 1.0
 */
package ch18;
import java.nio.*;
import java.nio.channels.*;
import java.io.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName LargeMappedFiles
 * @Description 内存映射文件。有了内存映射文件，我们可以假定整个文件都在内存中，而且完全可以把它当做非常大的数组访问
 * @author 吴扬颉
 * @date 2019年4月2日
 * 
 */
public class LargeMappedFiles {
	static int length = 0x8FFFFFF; // 128M
	public static void main(String[] args) throws Exception{
		MappedByteBuffer out = new RandomAccessFile("test.dat", "rw").getChannel()
				.map(FileChannel.MapMode.READ_WRITE, 0, length);
		for(int i = 0; i < length; i++)
			out.put((byte)'x');
		print("Finished writing");
		for(int i = length / 2; i < length / 2 + 6; i++)
			printnb((char)out.get(i));
		
	}
}

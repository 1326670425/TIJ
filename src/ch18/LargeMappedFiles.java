/**
 * @Title LargeMappedFiles.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * @version 1.0
 */
package ch18;
import java.nio.*;
import java.nio.channels.*;
import java.io.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName LargeMappedFiles
 * @Description �ڴ�ӳ���ļ��������ڴ�ӳ���ļ������ǿ��Լٶ������ļ������ڴ��У�������ȫ���԰��������ǳ�����������
 * @author �����
 * @date 2019��4��2��
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

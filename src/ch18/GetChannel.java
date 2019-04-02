/**
 * @Title GetChannel.java
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
/**
 * @ClassName GetChannel
 * @Description nio:Ŀ����������ٶȣ�ʹ��ͨ���ͻ�����
 * <p>�ɶ�����д���ɶ�д��ͨ��
 * @author �����
 * @date 2019��4��2��
 * 
 */
public class GetChannel {
	private static final int BSIZE = 1024;
	public static void main(String[] args) throws Exception{
		FileChannel fc = new FileOutputStream("data.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some txt ".getBytes()));
		fc.close();
		// Add to the end of the file
		fc = new RandomAccessFile("data.txt", "rw").getChannel();
		fc.position(fc.size());
		fc.write(ByteBuffer.wrap("Some more".getBytes()));
		fc.close();
		fc = new FileInputStream("data.txt").getChannel();
		ByteBuffer buff = ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		buff.flip();
		while(buff.hasRemaining())
			System.out.print((char)buff.get());
	}
}

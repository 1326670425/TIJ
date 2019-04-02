/**
 * @Title GetChannel.java
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
/**
 * @ClassName GetChannel
 * @Description nio:目的在于提高速度，使用通道和缓冲器
 * <p>可读、可写、可读写的通道
 * @author 吴扬颉
 * @date 2019年4月2日
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

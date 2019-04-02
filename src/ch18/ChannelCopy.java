/**
 * @Title ChannelCopy.java
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
 * @ClassName ChannelCopy
 * @Description ��channel��buffers������һ���ļ�
 * @author �����
 * @date 2019��4��2��
 * 
 */
public class ChannelCopy {
	private static final int BSIZE = 1024;
	public static void main(String[] args) throws Exception{
		if(args.length != 2){
			System.out.println("arguments: sourcefile destfile");
			System.exit(1);
		}
		FileChannel in = new FileInputStream(args[0]).getChannel(),
				out = new FileOutputStream(args[1]).getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
		while(in.read(buffer) != -1){
			buffer.flip();// ׼��д��
			out.write(buffer);
			buffer.clear(); //׼����ȡ
		}
	}
}

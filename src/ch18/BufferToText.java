/**
 * @Title BufferToText.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * @version 1.0
 */
package ch18;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.io.*;
/**
 * @ClassName BufferToText
 * @Description ת������
 * @author �����
 * @date 2019��4��2��
 * 
 */
public class BufferToText {
	private static final int BSIZE = 1024;
	public static void main(String[] args) throws Exception{
		FileChannel fc = new FileOutputStream("data2.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes()));
		fc.close();
		fc = new FileInputStream("data2.txt").getChannel();
		ByteBuffer buff = ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		buff.flip();
		// ������
		System.out.println(buff.asCharBuffer());
		// ��ϵͳĬ�ϱ��뷽ʽ����
		buff.rewind();
		// ����Ĭ���ַ�����������������ַ������Ƶ��ַ���
		String encoding = System.getProperty("file.encoding");
		System.out.println("Decoded using " + encoding + ": " + Charset.forName(encoding).decode(buff));
		// ���ߣ����ǿ������ܴ�ӡ�����ķ�ʽ����
		fc = new FileOutputStream("data2.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes("UTF-16BE")));
		fc.close();
		// ���ڳ����ٴζ�ȡ
		fc = new FileInputStream("data2.txt").getChannel();
		buff.clear();
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
		// ��CharBufferд
		fc = new FileOutputStream("data2.txt").getChannel();
		buff = ByteBuffer.allocate(24);
		buff.asCharBuffer().put("Some text");
		fc.write(buff);
		fc.close();
		// ��ȡ����ʾ
		fc = new FileInputStream("data2.txt").getChannel();
		buff.clear();
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
	}
}

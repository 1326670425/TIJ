/**
 * @Title BufferToText.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月2日
 * @version 1.0
 */
package ch18;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.io.*;
/**
 * @ClassName BufferToText
 * @Description 转换数据
 * @author 吴扬颉
 * @date 2019年4月2日
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
		// 不工作
		System.out.println(buff.asCharBuffer());
		// 用系统默认编码方式解码
		buff.rewind();
		// 发现默认字符集，它会产生代表字符集名称的字符串
		String encoding = System.getProperty("file.encoding");
		System.out.println("Decoded using " + encoding + ": " + Charset.forName(encoding).decode(buff));
		// 或者，我们可以用能打印出来的方式编码
		fc = new FileOutputStream("data2.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes("UTF-16BE")));
		fc.close();
		// 现在尝试再次读取
		fc = new FileInputStream("data2.txt").getChannel();
		buff.clear();
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
		// 用CharBuffer写
		fc = new FileOutputStream("data2.txt").getChannel();
		buff = ByteBuffer.allocate(24);
		buff.asCharBuffer().put("Some text");
		fc.write(buff);
		fc.close();
		// 读取并显示
		fc = new FileInputStream("data2.txt").getChannel();
		buff.clear();
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
	}
}

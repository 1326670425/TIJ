/**
 * @Title FileLocking.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * @version 1.0
 */
package ch18;
import java.nio.channels.*;
import java.io.*;
import java.util.concurrent.*;
/**
 * @ClassName FileLocking
 * @Description �ļ�����
 * @author �����
 * @date 2019��4��2��
 * 
 */
public class FileLocking {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("file.txt");
		// tryLock()�Ƿ������ģ������跨��ȡ���������ȡ�����������ͻ᷵��
		// lock()������ʽ�ģ�������������֪�������
		// ����ʹ�ã�tryLock(long position, long size, boolean shared)���ļ���һ��������
		FileLock fl = fos.getChannel().tryLock();
		if(fl != null){
			System.out.println("Locked File");
			TimeUnit.MILLISECONDS.sleep(100);
			fl.release();
			System.out.println("Released Lock");
		}
		fos.close();
	}
}

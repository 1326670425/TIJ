/**
 * @Title FileLocking.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月2日
 * @version 1.0
 */
package ch18;
import java.nio.channels.*;
import java.io.*;
import java.util.concurrent.*;
/**
 * @ClassName FileLocking
 * @Description 文件加锁
 * @author 吴扬颉
 * @date 2019年4月2日
 * 
 */
public class FileLocking {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("file.txt");
		// tryLock()是非阻塞的，它会设法获取锁，如果获取不到，方法就会返回
		// lock()是阻塞式的，它会阻塞进程知道获得锁
		// 可以使用：tryLock(long position, long size, boolean shared)对文件的一部分上锁
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

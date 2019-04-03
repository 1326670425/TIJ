/**
 * @Title ZipCompress.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月3日
 * @version 1.0
 */
package ch18;
import java.util.zip.*;
import java.io.*;
import java.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName ZipCompress
 * @Description 用Zip进行多文件保存
 * @author 吴扬颉
 * @date 2019年4月3日
 * 
 */
public class ZipCompress {
	public static void main(String[] args) throws IOException{
		FileOutputStream f = new FileOutputStream("test.zip");
		// Checksum类来计算和校验文件的校验和，两种Checksum类型：Adler32（较快） CRC32（较慢但是准确）
		CheckedOutputStream csum = new CheckedOutputStream(f, new Adler32());
		ZipOutputStream zos = new ZipOutputStream(csum);
		BufferedOutputStream out = new BufferedOutputStream(zos);
		// 写注释，但是没有获取注释的方法 即没有getComment()
		zos.setComment("A test of Java Zipping");
		for(String arg : args){
			print("Writing file " + arg);
			BufferedReader in = new BufferedReader(new FileReader(arg));
			// 对于每个要加入压缩文档的文件，都要先putNextEntry()，并将其传递给一个ZipEntry对象
			zos.putNextEntry(new ZipEntry(arg));
			int c;
			while((c = in.read()) != -1)
				out.write(c);
			in.close();
			out.flush();
		}
		out.close();
		// 只有当文件流已经关闭后，才可以校验和
		print("Checksum: " + csum.getChecksum().getValue());
		print("Reading file");
		FileInputStream fi = new FileInputStream("test.zip");
		CheckedInputStream csumi = new CheckedInputStream(fi, new Adler32());
		ZipInputStream in2 = new ZipInputStream(csumi);
		BufferedInputStream bis = new BufferedInputStream(in2);
		ZipEntry ze;
		while((ze = in2.getNextEntry()) != null){
			print("Reading file " + ze);
			int x;
			while((x = bis.read()) != -1)
				System.out.println(x);
		}
		if(args.length == 1)
			print("Checksum: " + csumi.getChecksum().getValue());
		bis.close();
		// 读取zip文件的另一种方式
		ZipFile zf = new ZipFile("test.zip");
		Enumeration e = zf.entries();
		while(e.hasMoreElements()){
			ZipEntry ze2 = (ZipEntry)e.nextElement();
			print("File: " + ze2);
			//... 读取文件操作
		}
		
	}
}

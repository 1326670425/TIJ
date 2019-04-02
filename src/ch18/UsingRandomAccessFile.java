/**
 * @Title UsingRandomAccessFile.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * @version 1.0
 */
package ch18;
import java.io.*;
/**
 * @ClassName UsingRandomAccessFile
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * 
 */
public class UsingRandomAccessFile {
	static String file = "rtest.dat";
	static void display() throws IOException{
		RandomAccessFile rf = new RandomAccessFile(file, "r");
		for(int i = 0; i < 7; i++)
			System.out.println("Value " + i + ": " + rf.readDouble());
		System.out.println(rf.readUTF());
		rf.close();
	}
	public static void main(String[] args) throws IOException{
		RandomAccessFile rf = new RandomAccessFile(file, "rw");
		for(int i = 0; i < 7; i++)
			rf.writeDouble(i * 1.414);
		rf.writeUTF("The end of the file");
		rf.close();
		display();
		rf = new RandomAccessFile(file, "rw");
		rf.seek(5 * 8);
		rf.writeDouble(47.0001);
		rf.close();
		display();
	}
}

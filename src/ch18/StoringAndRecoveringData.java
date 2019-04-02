/**
 * @Title StoringAndRecoveringData.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * @version 1.0
 */
package ch18;
import java.io.*;
/**
 * @ClassName StoringAndRecoveringData
 * @Description �洢�ͻָ�����
 * @author �����
 * @date 2019��4��2��
 * 
 */
public class StoringAndRecoveringData {
	public static void main(String[] args) throws IOException{
		DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("Data.txt")
						)
				);
		out.writeDouble(3.141592);
		out.writeUTF("That was pi");
		out.writeDouble(1.414);
		out.writeUTF("Squre root of 2");
		out.close();
		DataInputStream in  = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("Data.txt")
						)
				);
		System.out.println(in.readDouble());
		// Only readUTF() will recover the java-UTF String properly
		System.out.println(in.readUTF());
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
		in.close();
	}
}

/**
 * @Title Hex.java
 * @Package ch13
 * @Description TODO
 * @author �����
 * @date 2019��1��22��
 * @version 1.0
 */
package ch13;
import java.io.*;
/**
 * @ClassName Hex
 * @Description ʮ������ת��С����
 * @author �����
 * @date 2019��1��22��
 * 
 */
public class Hex {
	public static String format(byte[] data){
		StringBuffer result = new StringBuffer();
		int n = 0;
		for (byte b : data) {
			if(n % 16 == 0)
				result.append(String.format("%05x: ", n));
			result.append(String.format("%02x ", b));
			n++;
			if(n % 16 == 0)
				result.append("\n");
		}
		result.append("\n");
		return result.toString();
	}
	public static void main(String[] args) throws Exception{
		if(args.length == 0)
			;
			//System.out.println(format(BinaryFile.read("Hex.class")));
		else
			;
			//System.out.println(format(BinaryFile.read(new File(args[0]))));
	}
}

/**
 * @Title TransferTo.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * @version 1.0
 */
package ch18;
import java.nio.channels.*;
import java.io.*;
/**
 * @ClassName TransferTo
 * @Description �ܵ�����: transferTo()/transferFrom()
 * @author �����
 * @date 2019��4��2��
 * 
 */
public class TransferTo {
	public static void main(String[] args) throws Exception{
		if(args.length != 2){
			System.out.println("arguments: sourcefile destfile");
			System.exit(1);
		}
		FileChannel 
			in = new FileInputStream(args[0]).getChannel(),
			out = new FileOutputStream(args[1]).getChannel();
		in.transferTo(0, in.size(), out);
		// ����
		// out.transferFrom(in, 0, in.size());
	}
}

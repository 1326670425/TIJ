/**
 * @Title TransferTo.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月2日
 * @version 1.0
 */
package ch18;
import java.nio.channels.*;
import java.io.*;
/**
 * @ClassName TransferTo
 * @Description 管道连接: transferTo()/transferFrom()
 * @author 吴扬颉
 * @date 2019年4月2日
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
		// 或者
		// out.transferFrom(in, 0, in.size());
	}
}

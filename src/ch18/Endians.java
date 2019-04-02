/**
 * @Title Endians.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月2日
 * @version 1.0
 */
package ch18;
import java.nio.*;
import java.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName Endians
 * @Description 设置字节存放模式改变字符中的字节顺序
 * @author 吴扬颉
 * @date 2019年4月2日
 * 
 */
public class Endians {
	public static void main(String[] args) {
		ByteBuffer bb = ByteBuffer.wrap(new byte[12]);
		bb.asCharBuffer().put("abcdef");
		print(Arrays.toString(bb.array()));
		bb.rewind();
		bb.order(ByteOrder.BIG_ENDIAN);
		bb.asCharBuffer().put("abcdef");
		print(Arrays.toString(bb.array()));
		bb.rewind();
		bb.order(ByteOrder.LITTLE_ENDIAN);
		bb.asCharBuffer().put("abcdef");
		print(Arrays.toString(bb.array()));
	}
}

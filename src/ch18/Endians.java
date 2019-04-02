/**
 * @Title Endians.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * @version 1.0
 */
package ch18;
import java.nio.*;
import java.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName Endians
 * @Description �����ֽڴ��ģʽ�ı��ַ��е��ֽ�˳��
 * @author �����
 * @date 2019��4��2��
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

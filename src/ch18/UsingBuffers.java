/**
 * @Title UsingBuffers.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月2日
 * @version 1.0
 */
package ch18;
import java.nio.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName UsingBuffers
 * @Description 采用交换相邻字符，以对CharBuffer中的字符进行编码和译码
 * @author 吴扬颉
 * @date 2019年4月2日
 * 
 */
public class UsingBuffers {
	  private static void symmetricScramble(CharBuffer buffer){
		    while(buffer.hasRemaining()) {
		      buffer.mark();
		      char c1 = buffer.get();
		      char c2 = buffer.get();
		      buffer.reset();
		      buffer.put(c2).put(c1);
		    }
		  }
		  public static void main(String[] args) {
		    char[] data = "UsingBuffers".toCharArray();
		    ByteBuffer bb = ByteBuffer.allocate(data.length * 2);
		    CharBuffer cb = bb.asCharBuffer();
		    cb.put(data);
		    print(cb.rewind());
		    symmetricScramble(cb);
		    print(cb.rewind());
		    symmetricScramble(cb);
		    print(cb.rewind());
		  }
}

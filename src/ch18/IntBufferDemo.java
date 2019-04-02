/**
 * @Title IntBufferDemo.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月2日
 * @version 1.0
 */
package ch18;
import java.nio.*;
/**
 * @ClassName IntBufferDemo
 * @Description 视图缓冲器：通过某个特定的基本数据类型的视窗来查看其底层的ByteBuffer
 * @author 吴扬颉
 * @date 2019年4月2日
 * 
 */
public class IntBufferDemo {
	  private static final int BSIZE = 1024;
	  public static void main(String[] args) {
	    ByteBuffer bb = ByteBuffer.allocate(BSIZE);
	    IntBuffer ib = bb.asIntBuffer();
	    // Store an array of int:
	    ib.put(new int[]{ 11, 42, 47, 99, 143, 811, 1016 });
	    // Absolute location read and write:
	    System.out.println(ib.get(3));
	    ib.put(3, 1811);
	    // Setting a new limit before rewinding the buffer.
	    ib.flip();
	    while(ib.hasRemaining()) {
	      int i = ib.get();
	      System.out.println(i);
	    }
	  }
}

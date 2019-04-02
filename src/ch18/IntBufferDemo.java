/**
 * @Title IntBufferDemo.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * @version 1.0
 */
package ch18;
import java.nio.*;
/**
 * @ClassName IntBufferDemo
 * @Description ��ͼ��������ͨ��ĳ���ض��Ļ����������͵��Ӵ����鿴��ײ��ByteBuffer
 * @author �����
 * @date 2019��4��2��
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

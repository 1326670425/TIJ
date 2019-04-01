/**
 * @Title Bits.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月1日
 * @version 1.0
 */
package ch17;
import java.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName Bits
 * @Description BitSet:高效率的存储大量的开/关信息。不过它的效率仅仅是对空间而言。
 * <p>BitSet的最小容量是long 64位。
 * @author 吴扬颉
 * @date 2019年4月1日
 * 
 */
public class Bits {
	public static void printBitSet(BitSet b) {
	    print("bits: " + b);
	    StringBuilder bbits = new StringBuilder();
	    for(int j = 0; j < b.size() ; j++)
	      bbits.append(b.get(j) ? "1" : "0");
	    print("bit pattern: " + bbits);
	}
	public static void main(String[] args) {
	    Random rand = new Random(47);
	    // Take the LSB of nextInt():
	    byte bt = (byte)rand.nextInt();
	    BitSet bb = new BitSet();
	    for(int i = 7; i >= 0; i--)
	      if(((1 << i) &  bt) != 0)
	        bb.set(i);
	      else
	        bb.clear(i);
	    print("byte value: " + bt);
	    printBitSet(bb);

	    short st = (short)rand.nextInt();
	    BitSet bs = new BitSet();
	    for(int i = 15; i >= 0; i--)
	      if(((1 << i) &  st) != 0)
	        bs.set(i);
	      else
	        bs.clear(i);
	    print("short value: " + st);
	    printBitSet(bs);

	    int it = rand.nextInt();
	    BitSet bi = new BitSet();
	    for(int i = 31; i >= 0; i--)
	      if(((1 << i) &  it) != 0)
	        bi.set(i);
	      else
	        bi.clear(i);
	    print("int value: " + it);
	    printBitSet(bi);

	    // Test bitsets >= 64 bits:
	    BitSet b127 = new BitSet();
	    b127.set(127);
	    print("set bit 127: " + b127);
	    BitSet b255 = new BitSet(65);
	    b255.set(255);
	    print("set bit 255: " + b255);
	    BitSet b1023 = new BitSet(512);
	    b1023.set(1023);
	    b1023.set(1024);
	    print("set bit 1023: " + b1023);
	}
}

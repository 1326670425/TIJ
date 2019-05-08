/**
 * @Title Bubble.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.function.*;

/**
 * @ClassName Bubble
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class Bubble {
	  public final int i;
	  public Bubble(int n) { i = n; }
	  @Override
	  public String toString() {
	    return "Bubble(" + i + ")";
	  }
	  private static int count = 0;
	  public static Bubble bubbler() {
	    return new Bubble(count++);
	  }
}

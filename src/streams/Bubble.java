/**
 * @Title Bubble.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.function.*;

/**
 * @ClassName Bubble
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
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

/**
 * @Title QueueBehavior.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月31日
 * @version 1.0
 */
package ch17;
import java.util.concurrent.*;
import java.util.*;
import net.mindview.util.*;
/**
 * @ClassName QueueBehavior
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月31日
 * 
 */
public class QueueBehavior {
	private static int count = 10;
	  static <T> void test(Queue<T> queue, Generator<T> gen) {
	    for(int i = 0; i < count; i++)
	      queue.offer(gen.next());
	    while(queue.peek() != null)
	      System.out.print(queue.remove() + " ");
	    System.out.println();
	  }
	  static class Gen implements Generator<String> {
	    String[] s = ("one two three four five six seven " +
	      "eight nine ten").split(" ");
	    int i;
	    public String next() { return s[i++]; }
	  }
	  public static void main(String[] args) {
	    test(new LinkedList<String>(), new Gen());
	    test(new PriorityQueue<String>(), new Gen());
	    test(new ArrayBlockingQueue<String>(count), new Gen());
	    test(new ConcurrentLinkedQueue<String>(), new Gen());
	    test(new LinkedBlockingQueue<String>(), new Gen());
	    test(new PriorityBlockingQueue<String>(), new Gen());
	  }
}

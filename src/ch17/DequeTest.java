/**
 * @Title DequeTest.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月31日
 * @version 1.0
 */
package ch17;
import net.mindview.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName DequeTest
 * @Description 双端队列测试
 * @author 吴扬颉
 * @date 2019年3月31日
 * 
 */
public class DequeTest {
	static void fillTest(Deque<Integer> deque){
		for(int i = 20; i < 27; i++)
			deque.addFirst(i);
		for(int i = 50; i < 55; i++)
			deque.addLast(i);
	}
	public static void main(String[] args) {
		Deque<Integer> di = new Deque<Integer>();
		fillTest(di);
		print(di);
		while(di.size() != 0)
			printnb(di.removeFirst() + " ");
		print();
		fillTest(di);
		while(di.size() != 0)
			printnb(di.removeLast() + " ");
		print();
	}
}

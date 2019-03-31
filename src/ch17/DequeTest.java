/**
 * @Title DequeTest.java
 * @Package ch17
 * @Description TODO
 * @author �����
 * @date 2019��3��31��
 * @version 1.0
 */
package ch17;
import net.mindview.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName DequeTest
 * @Description ˫�˶��в���
 * @author �����
 * @date 2019��3��31��
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

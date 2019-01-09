/**
 * @Title QueueDemo.java
 * @Package ch11
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * @version 1.0
 */
package ch11;
import java.util.*;
/**
 * @ClassName QueueDemo
 * @Description LinkedList提供了方法以支持队列的行为，并且它实现了Queue接口。
 * @author 吴扬颉
 * @date 2019年1月9日
 * 
 */
public class QueueDemo {
	public static void printQ(Queue queue){
		// peek()和element()在不移除的情况下返回队头，但是peek()方法在队列为空时返回null，element()会抛出NoSuchElementException异常
		// 与之对应的是poll()和remove()
		while(queue.peek() != null)
			System.out.print(queue.remove() + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++) {
			queue.offer(rand.nextInt(i + 10));//队列插入方法，在允许的情况下，将一个元素插入到队尾或者返回false
		}
		System.out.println(queue);
		Queue<Character> qc = new LinkedList<Character>();
		for(char c : "Brontosaurus".toCharArray())
			qc.offer(c);
		printQ(qc);
	}
}

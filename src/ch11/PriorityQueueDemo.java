/**
 * @Title PriorityQueueDemo.java
 * @Package ch11
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * @version 1.0
 */
package ch11;
import java.util.*;
/**
 * @ClassName PriorityQueueDemo
 * @Description 优先级队列
 * @author 吴扬颉
 * @date 2019年1月9日
 * 
 */
public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = 
				new PriorityQueue<Integer>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++) {
			priorityQueue.offer(rand.nextInt(i + 10));
		}
		QueueDemo.printQ(priorityQueue);
		List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9,
				3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
		priorityQueue = new PriorityQueue<Integer>(ints);
		QueueDemo.printQ(priorityQueue);
		priorityQueue = new PriorityQueue<Integer>(
				ints.size(), Collections.reverseOrder());
		priorityQueue.addAll(ints);
		QueueDemo.printQ(priorityQueue);
		
		String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
		List<String> strings = Arrays.asList(fact.split(""));
		PriorityQueue<String> stringPQ = 
				new PriorityQueue<String>(strings);
		QueueDemo.printQ(stringPQ);
		stringPQ = new PriorityQueue<String>(
				strings.size(), Collections.reverseOrder());
		stringPQ.addAll(strings);
		
		Set<Character> charSet = new HashSet<Character>();
		for(char c : fact.toCharArray())
			charSet.add(c);
		PriorityQueue<Character> characterPQ = 
				new PriorityQueue<Character>(charSet);
		QueueDemo.printQ(characterPQ);
	}
}

/**
 * @Title QueueDemo.java
 * @Package ch11
 * @Description TODO
 * @author �����
 * @date 2019��1��9��
 * @version 1.0
 */
package ch11;
import java.util.*;
/**
 * @ClassName QueueDemo
 * @Description LinkedList�ṩ�˷�����֧�ֶ��е���Ϊ��������ʵ����Queue�ӿڡ�
 * @author �����
 * @date 2019��1��9��
 * 
 */
public class QueueDemo {
	public static void printQ(Queue queue){
		// peek()��element()�ڲ��Ƴ�������·��ض�ͷ������peek()�����ڶ���Ϊ��ʱ����null��element()���׳�NoSuchElementException�쳣
		// ��֮��Ӧ����poll()��remove()
		while(queue.peek() != null)
			System.out.print(queue.remove() + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++) {
			queue.offer(rand.nextInt(i + 10));//���в��뷽���������������£���һ��Ԫ�ز��뵽��β���߷���false
		}
		System.out.println(queue);
		Queue<Character> qc = new LinkedList<Character>();
		for(char c : "Brontosaurus".toCharArray())
			qc.offer(c);
		printQ(qc);
	}
}

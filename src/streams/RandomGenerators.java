/**
 * @Title RandomGenerators.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;

/**
 * @ClassName RandomGenerators
 * @Description Random���е���
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class RandomGenerators {
	public static <T> void show(Stream<T> stream) {
		stream.limit(4).forEach(System.out::println);
		System.out.println("+++++++++++");
	}
	
	public static void main(String[] args) {
		Random rand = new Random(47);
		// boxed()�����Ի�������װ��
		show(rand.ints().boxed());
		show(rand.longs().boxed());
		show(rand.doubles().boxed());
		// ����������
		show(rand.ints(10, 20).boxed());
		show(rand.longs(50, 100).boxed());
		show(rand.doubles(20, 30).boxed());
		// ��������С
		show(rand.ints(2).boxed());
		show(rand.longs(2).boxed());
		show(rand.doubles(2).boxed());
		// ͬʱ�������Ĵ�С��������
		show(rand.ints(3, 3, 9).boxed());
		show(rand.longs(3, 12, 22).boxed());
		show(rand.doubles(3, 11.5, 12.3).boxed());
	}
}

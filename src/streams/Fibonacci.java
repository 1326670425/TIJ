/**
 * @Title Fibonacci.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.stream.*;

/**
 * @ClassName Fibonacci
 * @Description iterate()����쳲���������
 * <p>Stream.iterate()�����ӣ���һ����������ͷ�����䴫���������ڶ����������������Ľ����ӵ�����
 * ���洢��Ϊ��һ�����������´ε���iterate()
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class Fibonacci {
	int x = 1;
	Stream<Integer> numbers() {
		return Stream.iterate(0, i -> {
			int result = x + i;
			x = i;
			return result;
		});
	}
	public static void main(String[] args) {
		new Fibonacci().numbers()
					   .skip(20) // ����ǰ20��Ԫ��
					   .limit(10)
					   .forEach(System.out::println);
	}
}

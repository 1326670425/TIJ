/**
 * @Title Duplicator.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.stream.*;

/**
 * @ClassName Duplicator
 * @Description ����������ͬ���������ֻ��Ҫ����һ�����ɶ����Lambda���ʽ
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class Duplicator {
	public static void main(String[] args) {
		Stream.generate(() -> "duplicate")
			  .limit(3)
			  .forEach(System.out::println);
	}
}

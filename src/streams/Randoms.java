/**
 * @Title Randoms.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.*;

/**
 * @ClassName Randoms
 * @Description ��ʽ��̣���ʾ5��20֮�����ѡ���������ֻ����һ�ε�����
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class Randoms {
	public static void main(String[] args) {
		new Random(47)
			.ints(5, 20)
			.distinct()
			.limit(7)
			.sorted()
			.forEach(System.out::println);
	}
}

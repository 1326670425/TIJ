/**
 * @Title ImperativeRandoms.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.*;

/**
 * @ClassName ImperativeRandoms
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class ImperativeRandoms {
	public static void main(String[] args) {
		Random rand = new Random(47);
		// ���򼯺ϣ���֤Ԫ�ز��ظ����ź���
		SortedSet<Integer> rints = new TreeSet<>();
		while(rints.size() < 7) {
			int r = rand.nextInt(20);
			// nextInt()�½�Ϊ0�����Թ���С��5��ֵ
			if(r < 5)
				continue;
			rints.add(r);
		}
		System.out.println(rints);
	}
}

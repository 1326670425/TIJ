/**
 * @Title ForEach.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;
import static streams.RandInts.*;

/**
 * @ClassName ForEach
 * @Description Ϊÿ��Ԫ��Ӧ�����ղ���
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class ForEach {
	static final int SZ = 14;
	public static void main(String[] args) {
		rands().limit(SZ)
			.forEach(n -> System.out.format("%d ", n));
		System.out.println();
		rands().limit(SZ)
			.parallel()// �����ڶ���������ϲ���
			.forEach(n -> System.out.format("%d ", n));
		System.out.println();
		rands().limit(SZ)
			.parallel()
			.forEachOrdered(n -> System.out.format("%d ", n));
	}
}

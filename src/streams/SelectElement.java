/**
 * @Title SelectElement.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��5��
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;
import static streams.RandInts.*;

/**
 * @ClassName SelectElement
 * @Description ѡ��Ԫ��
 * @author �����
 * @date 2019��5��5��
 * 
 */
public class SelectElement {
	public static void main(String[] args) {
		System.out.println(rands().findFirst().getAsInt());
		System.out.println(rands().parallel().findFirst().getAsInt());
		// �ǲ������У�findAny()ѡ�����ʵ�ǵ�һ��Ԫ�أ���ʹ�Ӷ����Ͽ���ѡ�������Ԫ��
		System.out.println(rands().findAny().getAsInt());
		System.out.println(rands().parallel().findAny().getAsInt());
	}
}

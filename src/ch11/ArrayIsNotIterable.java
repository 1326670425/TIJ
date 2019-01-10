/**
 * @Title ArrayIsNotIterable.java
 * @Package ch11
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * @version 1.0
 */
package ch11;
import java.util.*;
/**
 * @ClassName ArrayIsNotIterable
 * @Description foreach��������������������κ�Iterable�����Ⲣ����ζ������Ҳ��Iterable�����κ��Զ���װҲ���ᷢ��
 * @author �����
 * @date 2019��1��10��
 * 
 */
public class ArrayIsNotIterable {
	static <T> void test(Iterable<T> ib){
		for(T t : ib)
			System.out.print(t + " ");
	}
	public static void main(String[] args) {
		test(Arrays.asList(1, 2, 3));
		String[] strings = {"A", "B", "C"};
		// �������ʹ��foreach��������������Iterable
		//! test(strings);
		// �������κδ����鵽Iterable��ת���������ֶ�ת��Ϊһ��Iterable
		test(Arrays.asList(strings));
	}
}

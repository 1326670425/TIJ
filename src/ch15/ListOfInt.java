/**
 * @Title ListOfInt.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName ListOfInt
 * @Description �����������Ͳ����������Ͳ�����Ҫ�ö�Ӧ�İ�װ�ࡣ�����Զ���װ���Ʋ�����������
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class ListOfInt {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++)
			li.add(i);
		for(int i : li)
			System.out.print(i + " ");
	}
}

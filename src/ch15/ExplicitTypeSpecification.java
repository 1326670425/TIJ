/**
 * @Title ExplicitTypeSpecification.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��25��
 * @version 1.0
 */
package ch15;
import ch14.pets.*;
import java.util.*;
/**
 * @ClassName ExplicitTypeSpecification
 * @Description ���ͷ����п�����ʽָ�����͡�������ڶ���÷���������ڲ��������ڵ������֮ǰʹ��this�ؼ��֡������ʹ��static�����������ڵ������֮ǰ��������
 * @author �����
 * @date 2019��3��25��
 * 
 */
public class ExplicitTypeSpecification {
	static void f(Map<Person, List<Pet>> petPeople) { System.out.println(petPeople.getClass().getName()); }
	public static void main(String[] args) {
		f(New.<Person, List<Pet>>map());
	}
}

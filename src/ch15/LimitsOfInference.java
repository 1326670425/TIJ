/**
 * @Title LimitsOfInference.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��25��
 * @version 1.0
 */
package ch15;
import java.util.*;
import ch14.pets.*;
/**
 * @ClassName LimitsOfInference
 * @Description Thinking in Java�������ƶ�ֻ�Ը�ֵ������Ч������ʱ�������ã����粻�����ڲ������ݣ��������
 * <p>Java 8�¿��Ա���ͨ��
 * @author �����
 * @date 2019��3��25��
 * 
 */
public class LimitsOfInference {
	static void f(Map<Person, List<? extends Pet>> petPeople) { System.out.println(petPeople.getClass().getName()); }
	public static void main(String[] args) {
		f(New.map());
	}
}

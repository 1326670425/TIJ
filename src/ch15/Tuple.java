/**
 * @Title Tuple.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��25��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName Tuple
 * @Description Ӧ�����Ͳ����жϣ���Ƹ�ͨ�õ�tuple������
 * @author �����
 * @date 2019��3��25��
 * 
 */
public class Tuple {
	public static <A, B> TwoTuple<A, B> tuple(A a, B b){
		return new TwoTuple<A, B>(a, b);
	}
}

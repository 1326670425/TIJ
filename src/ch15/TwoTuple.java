/**
 * @Title TwoTuple.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��24��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName TwoTuple
 * @Description ��άԪ�飬���Գ�����������
 * @author �����
 * @date 2019��3��24��
 * 
 */
public class TwoTuple<A, B> {
	public final A first;
	public final B second;
	public TwoTuple(A a, B b){ first = a; second = b; }
	public String toString(){
		return "(" + first + ", " + second + ")";
	}
}

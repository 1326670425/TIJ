/**
 * @Title SelfBoundingMethods.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName SelfBoundingMethods
 * @Description ���޶����ڷ��ͷ���������Է�ֹ���������Ӧ���ڳ��������޶���������������κ�������ȥ
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class SelfBoundingMethods {
	static <T extends SelfBounded<T>> T f(T arg){
		return arg.set(arg).get();
	}
	public static void main(String[] args) {
		A a = f(new A());
	}
}

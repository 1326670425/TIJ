/**
 * @Title ReturnGenericType.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName ReturnGenericType
 * @Description ���һ�����и�Ҫ����T�ķ��������;��а��������ǿ��Է���ȷ�е�����
 * @author �����
 * @date 2019��3��26��
 * 
 */
public class ReturnGenericType<T extends HasF> {
	private T obj;
	public ReturnGenericType(T x){ obj = x; }
	public T get(){ return obj; }
}

/**
 * @Title InheritInner.java
 * @Package ch10
 * @Description TODO
 * @author �����
 * @date 2019��1��9��
 * @version 1.0
 */
package ch10;

class WithInner{
	class Inner {}
}
/**
 * @ClassName InheritInner
 * @Description �ڲ���ļ̳�
 * @author �����
 * @date 2019��1��9��
 * 
 */
// �ڲ���Ĺ������������ӵ�ָ������Χ���������ã������ڼ̳��ڲ����ʱ���Ǹ�ָ����Χ�����ġ����ܵġ����ñ��뱻��ʼ�������ڵ������в��ٴ��ڿ����ӵ�Ĭ�϶���
public class InheritInner extends WithInner.Inner{
	//! InheritInner() {} �޷�ͨ������
	InheritInner(WithInner wi){
		wi.super();
	}
	public static void main(String[] args) {
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
	}
}

/**
 * @Title MultiImplementation.java
 * @Package ch10
 * @Description TODO
 * @author �����
 * @date 2019��1��6��
 * @version 1.0
 */
package ch10;

class D {}
abstract class E {}
class Z extends D{
	E makeE() { return new E() {}; }
}

/**
 * @ClassName MultiImplementation
 * @Description ʹ���ڲ���ʵ�ֶ�̳�
 * @author �����
 * @date 2019��1��6��
 * 
 */
/*
 * (1) �ڲ�������ж��ʵ����ÿ��ʵ�������Լ���״̬��Ϣ������������Χ��������Ϣ�໥������
 * (2) 
 *  */
public class MultiImplementation {
	static void takesD(D d) {}
	static void takesE(E e) {}
	public static void main(String[] args) {
		Z z = new Z();
		takesD(z);
		takesE(z.makeE());
	}
}

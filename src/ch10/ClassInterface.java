/**
 * @Title ClassInterface.java
 * @Package ch10
 * @Description TODO
 * @author �����
 * @date 2019��1��6��
 * @version 1.0
 */
package ch10;

/**
 * @ClassName ClassInterface
 * @Description �ӿ��ڲ����ࣺǶ���������Ϊ�ӿڵ�һ���֣������������ڲ���ʵ������Χ�ӿ�
 * @author �����
 * @date 2019��1��6��
 * 
 */
public interface ClassInterface {
	void howdy();
	class Test implements ClassInterface{
		public void howdy(){
			System.out.println("Howdy!");
		}
		public static void main(String[] args) {
			new Test().howdy();
		}
	}
}

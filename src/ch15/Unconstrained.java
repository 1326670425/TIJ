/**
 * @Title Unconstrained.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * @version 1.0
 */
package ch15;

class Other{}
class BasicOther extends BasicHolder<Other>{}

/**
 * @ClassName Unconstrained
 * @Description BasicHolder����ʹ���κ�������Ϊ�䷺�Ͳ���
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class Unconstrained {
	public static void main(String[] args) {
		BasicOther b = new BasicOther(), b2 = new BasicOther();
		b.set(new Other());
		Other other = b.get();
		b.f();
	}
}

/**
 * @Title LocalInnerClass.java
 * @Package ch10
 * @Description TODO
 * @author �����
 * @date 2019��1��9��
 * @version 1.0
 */
package ch10;

interface Counter{
	int next();
}

/**
 * @ClassName LocalInnerClass
 * @Description �ֲ��ڲ��ࣺû�з���˵��������Ϊ��������Χ���һ���֣����������Է��ʵ�ǰ������ڵĳ����Լ���Χ������г�Ա
 * @author �����
 * @date 2019��1��9��
 * 
 */
public class LocalInnerClass {
	private int count = 0;
	Counter getCounter(final String name){
		// һ���ֲ��ڲ���
		class LocalCounter implements Counter{
			public LocalCounter(){
				// �ֲ��ڲ�������й�����
				System.out.println("LocalCounter");
			}
			public int next(){
				System.out.print(name);
				return count++;
			}
		}
		return new LocalCounter();
	}
	Counter getCounter2(final String name){
		return new Counter(){
			// �����ڲ��಻����һ��������������ֻ��һ��ʵ������
			{ System.out.println("Counter()"); }
			public int next(){
				System.out.print(name);
				return count++;
			}
		};
	}
	public static void main(String[] args) {
		LocalInnerClass lic = new LocalInnerClass();
		Counter 
			c1 = lic.getCounter("Local inner "),
			c2 = lic.getCounter2("Anonymous inner ");
			for (int i = 0; i < 5; i++) {
				System.out.println(c1.next());
			}
			for (int i = 0; i < 5; i++) {
				System.out.println(c2.next());
			}
	}
}
// ʹ�þֲ��ڲ�������������ڲ���������
// (1) ��Ҫһ���������Ĺ�������������Ҫ���ع��������������ڲ���ֻ������ʵ����ʼ����
// (2) ��Ҫ��ֹһ�����ڲ������

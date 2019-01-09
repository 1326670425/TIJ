/**
 * @Title BigEgg.java
 * @Package ch10
 * @Description TODO
 * @author �����
 * @date 2019��1��9��
 * @version 1.0
 */
package ch10;

class Egg{
	private Yolk y;
	protected class Yolk{
		public Yolk(){ System.out.println("Egg.Yolk()"); }
	}
	public Egg(){
		System.out.println("New Egg()");
		y = new Yolk();
	}
}

/**
 * @ClassName BigEgg
 * @Description ���Ը����ڲ���
 * @author �����
 * @date 2019��1��9��
 * 
 */
// ���̳���ĳ����Χ���ʱ���ڲ��ಢû�з���ʲô�ر�ı仯���������ڲ�������ȫ����������ʵ�壬�������Լ��������ռ��
public class BigEgg extends Egg{
	public class Yolk{
		public Yolk(){ System.out.println("BigEgg.Yolk()"); }
	}
	public static void main(String[] args) {
		new BigEgg();
	}
}

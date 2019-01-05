/**
 * @Title Parcel11.java
 * @Package ch10
 * @Description TODO
 * @author �����
 * @date 2019��1��5��
 * @version 1.0
 */
package ch10;

/**
 * @ClassName Parcel11
 * @Description Ƕ���ࣺ����Ҫ�ڲ���������ⲿ�����֮������ϵ�����Խ��ڲ�������Ϊstatic��
 * @author �����
 * @date 2019��1��5��
 * 
 */
/* Ƕ������ζ�ţ�
 * 	��1��Ҫ����Ƕ����Ķ��󣬲�����Ҫ�ⲿ��Ķ���
 * 	��2�����ܴ�Ƕ����Ķ����з��ʷǾ�̬���ⲿ�����
 * Ƕ�����벻ͬ���ڲ��໹��һ��������ͨ�ڲ�����ֶκͷ�����ֻ�ܷ�������ⲿ����ϣ�������ͨ���ڲ��಻����static���ݺ�static�ֶΣ�Ҳ���ܰ���Ƕ���ࡣ
 * ����Ƕ������԰���������Щ������
 * */
public class Parcel11 {
	private static class ParcelContents implements Contents{
		private int i = 11;
		public int value(){ return i; }
	}
	protected static class ParcelDestination implements Destination{
		private String label;
		private ParcelDestination(String whereTo){
			label = whereTo;
		}
		public String readLabel(){ return label; }
		public static void f(){}
		static int x = 10;
		static class AnotherLevel{
			public static void f(){}
			static int x = 10;
		}
	}
	public static Destination destination(String s){
		return new ParcelDestination(s);
	}
	public static Contents contents(){
		return new ParcelContents();
	}
	public static void main(String[] args) {
		Contents c = contents();
		Destination d = destination("HelloWorld");
	}
}

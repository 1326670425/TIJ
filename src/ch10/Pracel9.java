/**
 * @Title Pracel9.java
 * @Package ch10
 * @Description TODO
 * @author �����
 * @date 2019��1��5��
 * @version 1.0
 */
package ch10;

/**
 * @ClassName Pracel9
 * @Description ���������ж����ֶβ���ʼ�����������һ�������ڲ��࣬����ϣ����ʹ��һ�������ⲿ����Ķ�����ô��������Ҫ�����������Ϊfinal�ġ�
 * @author �����
 * @date 2019��1��5��
 * 
 */
public class Pracel9 {
	public Destination destiantion(final String dest){
		return new Destination() {
				private String label = dest;
				public String readLabel(){ return label; }
			};
	}
	public static void main(String[] args) {
		Pracel9 p = new Pracel9();
		Destination d = p.destiantion("HelloWorld");
	}
}

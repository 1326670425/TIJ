/**
 * @Title FieldAccess.java
 * @Package ch08
 * @Description TODO
 * @author �����
 * @date 2019��1��4��
 * @version 1.0
 */
package ch08;
class Super{
	public int field = 0;
	public int getField(){return field;}
}
class Sub extends Super{
	public int field = 1;
	
	public int getField(){return field;}
	public int getSuperField(){return super.field;}
}
/**
 * @ClassName FieldAccess
 * @Description ��̬�е����뾲̬����
 * @author �����
 * @date 2019��1��4��
 * 
 */
public class FieldAccess {
	public static void main(String[] args) {
		Super sup = new Sub();
		System.out.println("sup.filed = " + sup.field + ", sup.getField() = " + sup.getField());
		Sub sub = new Sub();
		System.out.println("sub.filed = " + sub.field + ", sub.getField() = " +
		sub.getField() + ", sub.getSuperFiled() = " + sub.getSuperField());
	}
}

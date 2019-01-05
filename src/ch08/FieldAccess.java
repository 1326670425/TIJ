/**
 * @Title FieldAccess.java
 * @Package ch08
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月4日
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
 * @Description 多态中的域与静态方法
 * @author 吴扬颉
 * @date 2019年1月4日
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

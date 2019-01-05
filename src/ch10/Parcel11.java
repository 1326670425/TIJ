/**
 * @Title Parcel11.java
 * @Package ch10
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月5日
 * @version 1.0
 */
package ch10;

/**
 * @ClassName Parcel11
 * @Description 嵌套类：不需要内部类对象与外部类对象之间有联系，可以将内部类声明为static。
 * @author 吴扬颉
 * @date 2019年1月5日
 * 
 */
/* 嵌套类意味着：
 * 	（1）要创建嵌套类的对象，并不需要外部类的对象。
 * 	（2）不能从嵌套类的对象中访问非静态的外部类对象
 * 嵌套类与不同的内部类还有一个区别：普通内部类的字段和方法，只能放在类的外部层次上，所以普通的内部类不能有static数据和static字段，也不能包含嵌套类。
 * 但是嵌套类可以包含所有这些东西。
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

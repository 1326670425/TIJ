/**
 * @Title Pracel9.java
 * @Package ch10
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月5日
 * @version 1.0
 */
package ch10;

/**
 * @ClassName Pracel9
 * @Description 在匿名类中定义字段并初始化。如果定义一个匿名内部类，并且希望它使用一个在其外部定义的对象，那么编译器就要求其参数引用为final的。
 * @author 吴扬颉
 * @date 2019年1月5日
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

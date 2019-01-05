/**
 * @Title Beetle.java
 * @Package ch07
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月4日
 * @version 1.0
 */
package ch07;

class Insect{
	private int i = 9;
	protected int j;
	Insect(){
		System.out.println("i = "+ i + ", j = " + j );
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	static int printInit(String s){
		System.out.println(s);
		return 47;
	}
}
/**
 * @ClassName Beetle
 * @Description 继承与初始化
 * @author 吴扬颉
 * @date 2019年1月4日
 * 
 */
public class Beetle extends Insect{
	private int k = printInit("Beetle.k initialized");
	public Beetle(){
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	private static int x2 = printInit("static Beetle.x2 initialized");
	public static void main(String[] args){
		System.out.println("Beetle constructor");
		Beetle b = new Beetle();
	}
}

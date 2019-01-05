/**
 * @Title PolyConstructors.java
 * @Package ch08
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月5日
 * @version 1.0
 */
package ch08;

class Glyph{
	void draw(){ System.out.println("Glyph.draw()"); }
	Glyph(){
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph{
	private int radius = 1;
	RoundGlyph(int i){
		radius = i;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	void draw(){
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}
/**
 * @ClassName PolyConstructors
 * @Description 在一个构造器内部调用正在构造的对象的某个动态绑定的方法。
 * @author 吴扬颉
 * @date 2019年1月5日
 * 
 */
//在构造器内唯一能够安全调用的那些方法是基类的final方法（也适用于private，他们也是final）。这些方法不会被覆盖。
public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}

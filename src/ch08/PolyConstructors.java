/**
 * @Title PolyConstructors.java
 * @Package ch08
 * @Description TODO
 * @author �����
 * @date 2019��1��5��
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
 * @Description ��һ���������ڲ��������ڹ���Ķ����ĳ����̬�󶨵ķ�����
 * @author �����
 * @date 2019��1��5��
 * 
 */
//�ڹ�������Ψһ�ܹ���ȫ���õ���Щ�����ǻ����final������Ҳ������private������Ҳ��final������Щ�������ᱻ���ǡ�
public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}

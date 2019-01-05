/**
 * @Title Music.java
 * @Package ch08
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月4日
 * @version 1.0
 */
package ch08;

enum Note{
	MIDDLE_E, C_SHARP, B_FLAT;
}
class Instrument{
	public void play(Note n){
		System.out.println("Instrument.play()");
	}
/*	private void play(Note n){
		System.out.println("Instrument.play()");
	}*/
}
class Wind extends Instrument{
//	@Override
//	基类为private时，并不会覆盖，只是新生成一个同名方法而已，故使用注解会出错
	public void play(Note n){
		System.out.println("Wind.play() " + n);
	}
}
/**
 * @ClassName Music
 * @Description 向上转型
 * @author 吴扬颉
 * @date 2019年1月4日
 * 
 */
public class Music {
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_E);
	}
	public static void main(String[] args){
		Wind flute = new Wind();
		tune(flute);
	}
}

/**
 * @Title Music.java
 * @Package ch08
 * @Description TODO
 * @author �����
 * @date 2019��1��4��
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
//	����Ϊprivateʱ�������Ḳ�ǣ�ֻ��������һ��ͬ���������ѣ���ʹ��ע������
	public void play(Note n){
		System.out.println("Wind.play() " + n);
	}
}
/**
 * @ClassName Music
 * @Description ����ת��
 * @author �����
 * @date 2019��1��4��
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

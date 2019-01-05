/**
 * @Title TestParcel.java
 * @Package ch10
 * @Description TODO
 * @author �����
 * @date 2019��1��5��
 * @version 1.0
 */
package ch10;

interface Destination{
	String readLabel();
}
interface Contents{
	int value();
}
class Parcel4{
	private class pContents implements Contents{
		private int i = 11;
		public int value(){ return i; }
	}
	protected class pDestination implements Destination{
		private String label;
		private pDestination(String whereTo){
			label = whereTo;
		}
		public String readLabel(){ return label; }
	}
	public Destination destination(String s){
		return new pDestination(s);
	}
	public Contents contents(){
		return new pContents();
	}
}

/**
 * @ClassName TestParcel
 * @Description �ڲ���������ת��
 * @author �����
 * @date 2019��1��5��
 * 
 */
public class TestParcel {
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("HelloWold");
		// ���ܷ���˽���ࣺ
		//! Parcel4.pContents pc = p.new pContents();
	}
}

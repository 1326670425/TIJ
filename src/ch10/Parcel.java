/**
 * @Title Parcel.java
 * @Package ch10
 * @Description TODO
 * @author �����
 * @date 2019��1��5��
 * @version 1.0
 */
package ch10;

/**
 * @ClassName Parcel
 * @Description �����ڲ���
 * @author �����
 * @date 2019��1��5��
 * 
 */
public class Parcel {
	class Contents{
		private int i =11;
		public int value(){ return i; }
	}
	class Destination{
		private String label;
		Destination(String whereTo){
			label = whereTo;
		}
		String readLabel(){ return label; }
	}
	public Destination to(String s){
		return new Destination(s);
	}
	public Contents contents(){
		return new Contents();
	}
	public void ship(String dest){
		Contents c = contents();
		Destination d = to(dest);
		System.out.println(d.readLabel());
	}
	public static void main(String[] args) {
		Parcel p = new Parcel();
		p.ship("HelloWorld");
		Parcel q = new Parcel();
		Parcel.Contents c = q.contents();
		Parcel.Destination d = q.to("Borneo");
	}
}

/**
 * @Title Parcel8.java
 * @Package ch10
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月5日
 * @version 1.0
 */
package ch10;

/**
 * @ClassName Parcel8
 * @Description 带参构造
 * @author 吴扬颉
 * @date 2019年1月5日
 * 
 */
public class Parcel8 {
	public Wrapping wrapping(int x){
		return new Wrapping(x){
			public int value(){
				return super.value() * 47;
			}
		};
	}
	public static void main(String[] args) {
		Parcel8 p = new Parcel8();
		Wrapping w = p.wrapping(10);
		System.out.println(w.value());
	}
}

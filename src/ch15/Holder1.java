/**
 * @Title Holder1.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月24日
 * @version 1.0
 */
package ch15;

class Automobile{}

/**
 * @ClassName Holder1
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月24日
 * 
 */
public class Holder1 {
	private Automobile a;
	public Holder1(Automobile a){
		this.a = a;
	}
	Automobile get(){ return a; }
}

/**
 * @Title Holder1.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��24��
 * @version 1.0
 */
package ch15;

class Automobile{}

/**
 * @ClassName Holder1
 * @Description TODO
 * @author �����
 * @date 2019��3��24��
 * 
 */
public class Holder1 {
	private Automobile a;
	public Holder1(Automobile a){
		this.a = a;
	}
	Automobile get(){ return a; }
}

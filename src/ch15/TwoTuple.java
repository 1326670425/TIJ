/**
 * @Title TwoTuple.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月24日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName TwoTuple
 * @Description 二维元组，可以持有两个对象
 * @author 吴扬颉
 * @date 2019年3月24日
 * 
 */
public class TwoTuple<A, B> {
	public final A first;
	public final B second;
	public TwoTuple(A a, B b){ first = a; second = b; }
	public String toString(){
		return "(" + first + ", " + second + ")";
	}
}

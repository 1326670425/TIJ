/**
 * @Title Manipulator2.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName Manipulator2
 * @Description 利用extends限定边界
 * @author 吴扬颉
 * @date 2019年3月26日
 * 
 */
public class Manipulator2<T extends HasF> {
	private T obj;
	public Manipulator2(T x){ obj = x; }
	public void manipulate(){ obj.f(); }
}

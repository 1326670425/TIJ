/**
 * @Title Manipulator2.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName Manipulator2
 * @Description ����extends�޶��߽�
 * @author �����
 * @date 2019��3��26��
 * 
 */
public class Manipulator2<T extends HasF> {
	private T obj;
	public Manipulator2(T x){ obj = x; }
	public void manipulate(){ obj.f(); }
}

/**
 * @Title StringHashCode.java
 * @Package ch17
 * @Description TODO
 * @author �����
 * @date 2019��3��31��
 * @version 1.0
 */
package ch17;

/**
 * @ClassName StringHashCode
 * @Description TODO
 * @author �����
 * @date 2019��3��31��
 * 
 */
public class StringHashCode {
	public static void main(String[] args) {
		String[] hellos = "Hello Hello".split(" ");
		System.out.println(hellos[0].hashCode());
		System.out.println(hellos[1].hashCode());
	}
}

/**
 * @Title SimpleFormat.java
 * @Package ch13
 * @Description TODO
 * @author �����
 * @date 2019��1��20��
 * @version 1.0
 */
package ch13;

/**
 * @ClassName SimpleFormat
 * @Description TODO
 * @author �����
 * @date 2019��1��20��
 * 
 */
public class SimpleFormat {
	public static void main(String[] args) {
		int x = 5;
		double y = 2.33333;
		System.out.println("Row 1: [" + x + " " + y + "]");
		System.out.format("Row 1: [%d %f]\n", x, y);
		System.out.printf("Row 1: [%d %f]\n", x, y);
	}
}

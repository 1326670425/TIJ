/**
 * @Title Finding.java
 * @Package ch13
 * @Description TODO
 * @author �����
 * @date 2019��2��1��
 * @version 1.0
 */
package ch13;
import java.util.regex.*;
/**
 * @ClassName Finding
 * @Description TODO
 * @author �����
 * @date 2019��2��1��
 * 
 */
public class Finding {
	public static void main(String[] args) {
		Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
		while(m.find())
			System.out.print(m.group() + " ");
		System.out.println();
		int i = 0;
		while(m.find(i)){
			System.out.print(m.group() + " ");
			i++;
		}
	}
}

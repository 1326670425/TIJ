/**
 * @Title ScannerDelimiter.java
 * @Package ch13
 * @Description TODO
 * @author �����
 * @date 2019��2��6��
 * @version 1.0
 */
package ch13;
import java.util.*;
/**
 * @ClassName ScannerDelimiter
 * @Description Scanner�����
 * @author �����
 * @date 2019��2��6��
 * 
 */
public class ScannerDelimiter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner("12, 42, 78, 99, 42");
		scanner.useDelimiter("\\s*,\\s*");
		while(scanner.hasNext())
				System.out.println(scanner.nextInt());
	}
}

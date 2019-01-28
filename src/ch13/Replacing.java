/**
 * @Title Replacing.java
 * @Package ch13
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月28日
 * @version 1.0
 */
package ch13;
import java.util.regex.Pattern;
/**
 * @ClassName Replacing
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月28日
 * 
 */
public class Replacing {
	static String s = Splitting.knights;
	public static void main(String[] args) {
		System.out.println(s.replaceFirst("f\\w+", "located"));
		System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
	}
}

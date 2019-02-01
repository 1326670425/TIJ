/**
 * @Title ReFlags.java
 * @Package ch13
 * @Description TODO
 * @author �����
 * @date 2019��2��1��
 * @version 1.0
 */
package ch13;
import java.util.regex.*;
/**
 * @ClassName ReFlags
 * @Description Pattern�ı��
 * @author �����
 * @date 2019��2��1��
 * 
 */
public class ReFlags {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("^java",Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
		Matcher m = p.matcher("java has regex\nJava has regex\nJAVA has pretty good regular expressions\n" + 
		"Regular expressions are in Java");
		while(m.find())
			System.out.println(m.group());
	}
}

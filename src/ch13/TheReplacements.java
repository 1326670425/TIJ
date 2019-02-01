/**
 * @Title TheReplacements.java
 * @Package ch13
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月1日
 * @version 1.0
 */
package ch13;
import java.util.regex.*;
/**
 * @ClassName TheReplacements
 * @Description appendReplacement()方法允许在执行替换过程中，操作用来替换的字符串。
 * <p>appendTail(StringBuffer sbuf)方法：在执行一次或多次appendReplacement()后，该方法可以将输入字符串余下的部分复制到sbuf中
 * @author 吴扬颉
 * @date 2019年2月1日
 * 
 */
public class TheReplacements {
	public static void main(String[] args) {
		String s = "";
		Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);
		if(mInput.find())
			s = mInput.group(1);
		//把多个空格替换为一个空格
		s = s.replaceAll(" {2,}", " ");
		//去掉每行前边的空格，必须使用MULTILINE模式
		s = s.replaceAll("(?m)^ +", "");
		System.out.print(s);
		s = s.replaceFirst("{aeiou}", "(VOWEL1)");
		StringBuffer sbuf = new StringBuffer();
		Pattern p = Pattern.compile("[aeiou]");
		Matcher m = p.matcher(s);
		while(m.find())
			m.appendReplacement(sbuf, m.group().toUpperCase());
		m.appendTail(sbuf);
		System.out.println(sbuf);
	}
}

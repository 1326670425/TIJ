/**
 * @Title TheReplacements.java
 * @Package ch13
 * @Description TODO
 * @author �����
 * @date 2019��2��1��
 * @version 1.0
 */
package ch13;
import java.util.regex.*;
/**
 * @ClassName TheReplacements
 * @Description appendReplacement()����������ִ���滻�����У����������滻���ַ�����
 * <p>appendTail(StringBuffer sbuf)��������ִ��һ�λ���appendReplacement()�󣬸÷������Խ������ַ������µĲ��ָ��Ƶ�sbuf��
 * @author �����
 * @date 2019��2��1��
 * 
 */
public class TheReplacements {
	public static void main(String[] args) {
		String s = "";
		Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);
		if(mInput.find())
			s = mInput.group(1);
		//�Ѷ���ո��滻Ϊһ���ո�
		s = s.replaceAll(" {2,}", " ");
		//ȥ��ÿ��ǰ�ߵĿո񣬱���ʹ��MULTILINEģʽ
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

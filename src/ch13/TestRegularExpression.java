/**
 * @Title TestRegularExpression.java
 * @Package ch13
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月29日
 * @version 1.0
 */
package ch13;

import java.util.regex.*;

/**
 * @ClassName TestRegularExpression
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月29日
 * 
 */
public class TestRegularExpression {
	public static void main(String[] args) {
		if(args.length < 2){
			System.out.println("Usage:\njava TestRegularExpression characterSequence regularExpression+");
			System.exit(0);
		}
		System.out.println("Input: \"" + args[0] + "\"");
		for (String arg : args) {
			System.out.println("Regular expression: \"" + arg + "\"");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(args[0]);
			while(m.find()){
				System.out.println("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1));
			}
		}
	}
}

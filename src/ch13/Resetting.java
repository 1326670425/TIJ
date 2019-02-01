/**
 * @Title Resetting.java
 * @Package ch13
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月1日
 * @version 1.0
 */
package ch13;
import java.util.regex.*;
/**
 * @ClassName Resetting
 * @Description reset()方法可以将现有的Matcher对象应用于一个新的字符序列
 * <p>reset()方法也可与IO结合，每次加载一行输入
 * @author 吴扬颉
 * @date 2019年2月1日
 * 
 */
public class Resetting {
	public static void main(String[] args) {
		Matcher m = Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
		while(m.find())
			System.out.print(m.group() + " ");
		System.out.println();
		m.reset("fix the rig with rags");
		while(m.find())
			System.out.print(m.group() + " ");
	}
}

/**
 * @Title Spiltting.java
 * @Package ch13
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月28日
 * @version 1.0
 */
package ch13;
import java.util.*;
/**
 * @ClassName Spiltting
 * @Description String.spilt()的用法
 * @author 吴扬颉
 * @date 2019年1月28日
 * 
 */
public class Splitting {
	public static String knights = 
			"Then, when you have found the shrubbery, you must " +
			"cut down the mightiest tree in the forest... " +
			"with... a herring!";
	public static void split(String regex){
		System.out.println(Arrays.toString(knights.split(regex)));
	}
	public static void main(String[] args) {
		split(" ");//按空格划分
		split("\\W+");//按非单词字符划分
		split("n\\W+");//'n'后加非单词字符划分
	}
}

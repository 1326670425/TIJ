/**
 * @Title UsingStringBuilder.java
 * @Package ch13
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月14日
 * @version 1.0
 */
package ch13;
import java.util.*;
/**
 * @ClassName UsingStringBuilder
 * @Description 预先指定StringBuilder可以避免多次重新分配缓冲，简洁高效。
 * <p>当为一个类编写toString()方法时，如果字符串比较简单，可以信赖编译器来合理构建最终的字符串结果。
 * 如果有循环之类，那么最好自己构建个StringBuilder类对象，用它来构建最终结果
 * @author 吴扬颉
 * @date 2019年1月14日
 * 
 */
public class UsingStringBuilder {
	public static Random rand = new Random(47);
	public String toString(){
		StringBuilder result = new StringBuilder("[");
		for (int i = 0; i < 25; i++) {
			result.append(rand.nextInt(100));
			result.append(", ");
		}
		result.delete(result.length()-2, result.length());
		result.append("]");
		return result.toString();
	}
	public static void main(String[] args) {
		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);
	}
}

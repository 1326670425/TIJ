/**
 * @Title Spiltting.java
 * @Package ch13
 * @Description TODO
 * @author �����
 * @date 2019��1��28��
 * @version 1.0
 */
package ch13;
import java.util.*;
/**
 * @ClassName Spiltting
 * @Description String.spilt()���÷�
 * @author �����
 * @date 2019��1��28��
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
		split(" ");//���ո񻮷�
		split("\\W+");//���ǵ����ַ�����
		split("n\\W+");//'n'��ӷǵ����ַ�����
	}
}

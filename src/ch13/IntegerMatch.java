/**
 * @Title IntegerMatch.java
 * @Package ch13
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月28日
 * @version 1.0
 */
package ch13;

/**
 * @ClassName IntegerMatch
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月28日
 * 
 */
public class IntegerMatch {
	public static void main(String[] args) {
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("5678".matches("-?\\d+"));
		System.out.println("+911".matches("-?\\d+"));
		System.out.println("+911".matches("(-|\\+)?\\d+"));
	}
}

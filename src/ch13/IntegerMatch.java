/**
 * @Title IntegerMatch.java
 * @Package ch13
 * @Description TODO
 * @author �����
 * @date 2019��1��28��
 * @version 1.0
 */
package ch13;

/**
 * @ClassName IntegerMatch
 * @Description TODO
 * @author �����
 * @date 2019��1��28��
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

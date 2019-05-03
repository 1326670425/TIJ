/**
 * @Title RecursiveFactorial.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

/**
 * @ClassName RecursiveFactorial
 * @Description 使用Lambda表达式计算阶乘
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class RecursiveFactorial {
	static IntCall fact;
	public static void main(String[] args) {
		fact = n -> n == 0 ? 1 : n * fact.call(n - 1);
		for (int i = 0; i <= 10; i++) {
			System.out.println(fact.call(i));
		}
	}
}

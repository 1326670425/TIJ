/**
 * @Title RecursiveFactorial.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

/**
 * @ClassName RecursiveFactorial
 * @Description ʹ��Lambda���ʽ����׳�
 * @author �����
 * @date 2019��5��3��
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

/**
 * @Title TriFunctionTest.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

/**
 * @ClassName TriFunctionTest
 * @Description ������д�Ķ�����ӿ�
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class TriFunctionTest {
	static int f(int i, long l, double d) { return 99; }
	public static void main(String[] args) {
		TriFunction<Integer, Long, Double, Integer> tf = TriFunctionTest::f;
		tf = (i, l, d) -> 12;
	}
}

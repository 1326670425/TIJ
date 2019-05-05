/**
 * @Title TriFunctionTest.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

/**
 * @ClassName TriFunctionTest
 * @Description 测试自写的多参数接口
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class TriFunctionTest {
	static int f(int i, long l, double d) { return 99; }
	public static void main(String[] args) {
		TriFunction<Integer, Long, Double, Integer> tf = TriFunctionTest::f;
		tf = (i, l, d) -> 12;
	}
}

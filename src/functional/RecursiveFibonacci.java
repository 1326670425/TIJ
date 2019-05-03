/**
 * @Title RecursiveFibonacci.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

/**
 * @ClassName RecursiveFibonacci
 * @Description 使用Lambda表达式计算Fibonacci数列
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class RecursiveFibonacci {
	IntCall fib;
	
	RecursiveFibonacci() {
		fib = n -> n == 0 ? 0 :
				   n == 1 ? 1 :
				   fib.call(n - 1) + fib.call(n - 2);
	}
	
	int fibonacci(int n){ return fib.call(n); }
	
	public static void main(String[] args) {
		RecursiveFibonacci rf = new RecursiveFibonacci();
		for (int i = 0; i <= 10; i++) {
			System.out.println(rf.fibonacci(i));
		}
	}
}

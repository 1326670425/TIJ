/**
 * @Title Fibonacci.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��24��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName Fibonacci
 * @Description TODO
 * @author �����
 * @date 2019��3��24��
 * 
 */
public class Fibonacci implements Generator<Integer>{
	private int count = 0;
	public Integer next(){ return fib(count++); }
	private int fib(int n){
		if(n < 2)
			return 1;
		return fib(n - 2) + fib(n - 1);
	}
	public static void main(String[] args) {
		Fibonacci gen = new Fibonacci();
		for(int i = 0; i < 18; i++)
			System.out.print(gen.next() + " ");
	}
}

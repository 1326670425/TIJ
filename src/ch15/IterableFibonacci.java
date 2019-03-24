/**
 * @Title IterableFibonacci.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月24日
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName IterableFibonacci
 * @Description 采用适配器模式，实现Iterable的Fibonacci生成器
 * @author 吴扬颉
 * @date 2019年3月24日
 * 
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer>{
	private int n;
	public IterableFibonacci(int count){ n = count; }
	public Iterator<Integer> iterator(){
		return new Iterator<Integer>(){
			public boolean hasNext(){ return n > 0; }
			public Integer next(){
				n--;
				return IterableFibonacci.this.next();
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void main(String[] args) {
		for(int i : new IterableFibonacci(18))
			System.out.print(i + " ");
	}
}

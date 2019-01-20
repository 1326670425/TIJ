/**
 * @Title InfiniteRecursion.java
 * @Package ch13
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月20日
 * @version 1.0
 */
package ch13;
import java.util.*;
/**
 * @ClassName InfiniteRecursion
 * @Description 打印对象内存地址
 * @author 吴扬颉
 * @date 2019年1月20日
 * 
 */
public class InfiniteRecursion {
	public String toString(){
		/*
		 * 这里发生了自动类型转换，因为编译器看到String对象后跟了个"+"，而再后边的对象不是String，于是编译器就试着将this转化为一个String
		 * 它通过调用this的toString()方法，于是发生了递归调用。
		 * 如果想打印对象的内存地址，那么应该调用Object.toString()方法，即super.toString()
		 */
		//return " InfiniteRecursion address: " + this + "\n";
		return " InfiniteRecursion address: " + super.toString() + "\n";
	}
	public static void main(String[] args) {
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		for (int i = 0; i < 10; i++) {
			v.add(new InfiniteRecursion());
		}
		System.out.println(v);
	}
}

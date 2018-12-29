/**
 * @Title VarArgs.java
 * @Package ch05
 * @Description 可变参数列表
 * @author 吴扬颉
 * @date 2018年12月29日
 * @version 1.0
 */
package ch05;

/**
 * @ClassName VarArgs
 * @Description TODO
 * @author 吴扬颉
 * @date 2018年12月29日
 * 
 */
class A{}
public class VarArgs {
	static void printArray(Object... args){
		for(Object obj:args)
			System.out.print(obj+" ");
		System.out.println();
	}
	public static void main(String[] args){
		printArray(new Integer(47),new Float(3.14),new Double(11.11));
		printArray(47,3.14,11.11);
		printArray("one","two","three");
		printArray(new A(),new A(),new A());
		printArray();
	}
}

/**
 * @Title VarArgs.java
 * @Package ch05
 * @Description �ɱ�����б�
 * @author �����
 * @date 2018��12��29��
 * @version 1.0
 */
package ch05;

/**
 * @ClassName VarArgs
 * @Description TODO
 * @author �����
 * @date 2018��12��29��
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

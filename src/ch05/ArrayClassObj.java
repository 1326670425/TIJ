/**
 * @Title ArrayClassObj.java
 * @Package ch05
 * @Description TODO
 * @author �����
 * @date 2018��12��29��
 * @version 1.0
 */
package ch05;
import java.util.*;

/**
 * @ClassName ArrayClassObj
 * @Description TODO
 * @author �����
 * @date 2018��12��29��
 * 
 */
public class ArrayClassObj {
	public static void main(String[] args){
		Random rand = new Random(47);
		Integer[] a = new Integer[rand.nextInt(20)];
		System.out.println(a.length);
		for(int i = 0;i<a.length;i++)
			a[i] = rand.nextInt(500);//�Զ�װ��
		System.out.println(Arrays.toString(a));
		for(int x:a)
			System.out.print(x+" ");
		
	}
}

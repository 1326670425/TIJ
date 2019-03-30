/**
 * @Title ArraySearching.java
 * @Package ch16
 * @Description TODO
 * @author �����
 * @date 2019��3��30��
 * @version 1.0
 */
package ch16;

import java.util.*;
import net.mindview.util.*;

/**
 * @ClassName ArraySearching
 * @Description �����������ظ�Ԫ�أ��޷���֤�ҵ������ĸ�
 * @author �����
 * @date 2019��3��30��
 * 
 */
public class ArraySearching {
	public static void main(String[] args) {
		Generator<Integer> gen = new RandomGenerator.Integer(1000);
		int[] a = ConvertTo.primitive(Generated.array(new Integer[25], gen));
		Arrays.sort(a);
		System.out.println("Sorted array: " + Arrays.toString(a));
		while(true){
			int r = gen.next();
			int location = Arrays.binarySearch(a, r);
			if(location >= 0){
				System.out.println("Location of " + r + " is " + location + ", a[" + location + "]= " + a[location]);
				break;
			}
		}
	}
}

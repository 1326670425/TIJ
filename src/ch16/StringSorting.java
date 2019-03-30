/**
 * @Title StringSorting.java
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
 * @ClassName StringSorting
 * @Description String����
 * @author �����
 * @date 2019��3��30��
 * 
 */
public class StringSorting {
	public static void main(String[] args) {
		String[] sa = Generated.array(new String[20], new RandomGenerator.String(5));
		System.out.println("before sorting:");
		System.out.println(Arrays.toString(sa));
		Arrays.sort(sa);
		System.out.println("after sorting:");
		Arrays.sort(sa, Collections.reverseOrder());
		System.out.println("Reverse sorting:");
		System.out.println(Arrays.toString(sa));
		// Ĭ���Ǵ�д��ĸ��ǰ�������������Ժ��Դ�Сд
		Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
		System.out.println("Case-insensitive sorting:");
		System.out.println(Arrays.toString(sa));
		
	}
}

/**
 * @Title TestGenerated.java
 * @Package ch16
 * @Description TODO
 * @author �����
 * @date 2019��3��29��
 * @version 1.0
 */
package ch16;
import java.util.*;
import net.mindview.util.*;
/**
 * @ClassName TestGenerated
 * @Description TODO
 * @author �����
 * @date 2019��3��29��
 * 
 */
public class TestGenerated {
	public static void main(String[] args) {
		Integer[] a = {9, 8, 7, 6};
		System.out.println(Arrays.toString(a));
		a = Generated.array(a, new CountingGenerator.Integer());
		System.out.println(Arrays.toString(a));
		Integer[] b = Generated.array(Integer.class, new CountingGenerator.Integer(), 15);
		System.out.println(Arrays.toString(b));
	}
}

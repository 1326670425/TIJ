/**
 * @Title CompType.java
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
 * @ClassName CompType
 * @Description �Ƚϣ�ʵ��Comparable�ӿڣ�ʵ��Comparator�ӿ�
 * @author �����
 * @date 2019��3��30��
 * 
 */
public class CompType implements Comparable<CompType>{
	int i, j;
	private static int count = 1;
	public CompType(int n1, int n2){
		i = n1;
		j = n2;
	}
	public String toString(){
		String result = "[i = " + i + ", j = " + j + "]";
		if(count++ % 3 == 0)
			result += "\n";
		return result;
	}
	public int compareTo(CompType rv){
		return (i < rv.i ? -1 : (i == rv.i ? 0 : 1));
	}
	private static Random r = new Random(47);
	public static Generator<CompType> generator(){
		return new Generator<CompType>(){
			public CompType next(){
				return new CompType(r.nextInt(100), r.nextInt(100));
			}
		};
	}
	
	public static void main(String[] args) {
		CompType[] a = Generated.array(new CompType[12], generator());
		System.out.println("before sorting:");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting:");
		System.out.println(Arrays.toString(a));
	}
}

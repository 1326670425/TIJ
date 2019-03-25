/**
 * @Title New.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��25��
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName New
 * @Description �����࣬ר�������������ֳ��õ���������ͨ�����Ͳ����ƶϼ򻯹����������ƶ�ֻ�Ը�ֵ������Ч������ʱ�������ã����粻�����ڲ������ݣ�
 * @author �����
 * @date 2019��3��25��
 * 
 */
public class New {
	public static <K, V> Map<K, V> map(){
		return new HashMap<K, V>();
	}
	public static <T> List<T> list(){
		return new ArrayList<T>();
	}
	public static <T> LinkedList<T> lList(){
		return new LinkedList<T>();
	}
	public static <T> Set<T> set(){
		return new HashSet<T>();
	}
	public static <T> Queue<T> queue(){
		return new LinkedList<T>();
	}
	
	public static void main(String[] args) {
		Map<String, List<String>> sls = New.map();
		List<String> ls = New.list();
		LinkedList<String> lls = New.lList();
		Set<String> ss = New.set();
		Queue<String> qs = New.queue();
	}
	
}

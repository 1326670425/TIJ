/**
 * @Title Synchronization.java
 * @Package ch17
 * @Description TODO
 * @author �����
 * @date 2019��4��1��
 * @version 1.0
 */
package ch17;
import java.util.*;

/**
 * @ClassName Synchronization
 * @Description Collection��ͬ�����ơ������������ʾ��ֱ�ӽ������ɵ��������ݸ��ʵ���ͬ��������
 * �������������κλ��ᱩ¶����ͬ���İ汾
 * @author �����
 * @date 2019��4��1��
 * 
 */
public class Synchronization {
	public static void main(String[] args) {
		Collection<String> c = Collections.synchronizedCollection(new ArrayList<String>());
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		Set<String> s = Collections.synchronizedSet(new HashSet<String>());
		Set<String> ss = Collections.synchronizedSortedSet(new TreeSet<String>());
		Map<String, String> m = Collections.synchronizedMap(new HashMap<String, String>());
		Map<String, String> sm = Collections.synchronizedSortedMap(new TreeMap<String, String>());
		
	}
}

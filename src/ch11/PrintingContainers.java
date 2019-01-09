/**
 * @Title PrintingContainers.java
 * @Package ch11
 * @Description TODO
 * @author �����
 * @date 2019��1��9��
 * @version 1.0
 */
package ch11;
import java.util.*;

/**
 * @ClassName PrintingContainers
 * @Description �����Ĵ�ӡ
 * @author �����
 * @date 2019��1��9��
 * 
 */
public class PrintingContainers {
	static Collection fill(Collection<String> collection){
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}
	static Map fill(Map<String,String> map){
		map.put("rat", "Fuzzy");
		map.put("cat", "Rags");
		map.put("dog", "Bosco");
		map.put("dog", "Spot");
		return map;
	}
	public static void main(String[] args) {
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		System.out.println(fill(new HashMap<String,String>()));
		System.out.println(fill(new TreeMap<String,String>()));
		System.out.println(fill(new LinkedHashMap<String,String>()));
	}
}
// ArrayList��LinkedList���ǰ��ձ������˳�򱣴�Ԫ��
// HashSet��TreeSet��LinkedSetÿ����ͬ����ֻ����һ�Ρ�
// TreeSet���ձȽϽ�������򱣴����LinkedHashSetʹ�ò���˳�򱣴����
// HashSet��HashMap�ṩ���Ĳ����ٶ�
// TreeMap���ձȽϽ�������򱣴����
// LinkedHashMap���ղ���˳�򱣴����ͬʱ��������HashMap�Ĳ�ѯ�ٶȡ�

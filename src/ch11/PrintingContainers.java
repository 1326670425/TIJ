/**
 * @Title PrintingContainers.java
 * @Package ch11
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * @version 1.0
 */
package ch11;
import java.util.*;

/**
 * @ClassName PrintingContainers
 * @Description 容器的打印
 * @author 吴扬颉
 * @date 2019年1月9日
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
// ArrayList和LinkedList都是按照被插入的顺序保存元素
// HashSet、TreeSet和LinkedSet每个相同的项只保存一次。
// TreeSet按照比较结果的升序保存对象，LinkedHashSet使用插入顺序保存对象
// HashSet，HashMap提供最快的查找速度
// TreeMap按照比较结果的升序保存对象
// LinkedHashMap按照插入顺序保存键，同时还保留了HashMap的查询速度。

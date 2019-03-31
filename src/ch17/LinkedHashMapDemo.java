/**
 * @Title LinkedHashMapDemo.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月31日
 * @version 1.0
 */
package ch17;
import java.util.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName LinkedHashMapDemo
 * @Description LinkedHashMap散列化所有元素，遍历时又以元素插入顺序访问。可在构造器中设定LinkedHashMap（ 容量，装填因子，访问方式（true按访问顺序排序，false按插入顺序排序）），
 * 使之采用基于访问的最近最少使用算法，按访问次数排序
 * @author 吴扬颉
 * @date 2019年3月31日
 * 
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {
	    LinkedHashMap<Integer,String> linkedMap =
	      new LinkedHashMap<Integer,String>(
	        new CountingMapData(9));
	    print(linkedMap);
	    // Least-recently-used order:
	    
	    linkedMap =
	      new LinkedHashMap<Integer,String>(16, 0.75f, true);
	    linkedMap.putAll(new CountingMapData(9));
	    print(linkedMap);
	    for(int i = 0; i < 6; i++) // Cause accesses:
	      linkedMap.get(i);
	    print(linkedMap);
	    linkedMap.get(0);
	    print(linkedMap);
	  }
}

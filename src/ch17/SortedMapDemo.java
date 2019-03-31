/**
 * @Title SortedMapDemo.java
 * @Package ch17
 * @Description TODO
 * @author �����
 * @date 2019��3��31��
 * @version 1.0
 */
package ch17;
import java.util.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName SortedMapDemo
 * @Description TODO
 * @author �����
 * @date 2019��3��31��
 * 
 */
public class SortedMapDemo {
	public static void main(String[] args) {
	    TreeMap<Integer,String> sortedMap =
	      new TreeMap<Integer,String>(new CountingMapData(10));
	    print(sortedMap);
	    Integer low = sortedMap.firstKey();
	    Integer high = sortedMap.lastKey();
	    print(low);
	    print(high);
	    Iterator<Integer> it = sortedMap.keySet().iterator();
	    for(int i = 0; i <= 6; i++) {
	      if(i == 3) low = it.next();
	      if(i == 6) high = it.next();
	      else it.next();
	    }
	    print(low);
	    print(high);
	    print(sortedMap.subMap(low, high));
	    print(sortedMap.headMap(high));
	    print(sortedMap.tailMap(low));
	  }
}

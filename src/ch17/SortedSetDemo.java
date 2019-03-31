/**
 * @Title SortedSetDemo.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月31日
 * @version 1.0
 */
package ch17;
import java.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName SortedSetDemo
 * @Description SortedSet按照对象的比较函数对元素排序，LinkedHashSet对插入顺序排序
 * @author 吴扬颉
 * @date 2019年3月31日
 * 
 */
public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet<String> sortedSet = new TreeSet<String>();
		Collections.addAll(sortedSet, "one two three four five six seven eight".split(" "));
		print(sortedSet);
		String low = sortedSet.first();
		String high = sortedSet.last();
		print(low);
		print(high);
		Iterator<String> it = sortedSet.iterator();
		for(int i = 0; i <= 6; i++){
			if(i == 3)
				low = it.next();
			if(i == 6)
				high = it.next();
			else
				it.next();
		}
		print(low);
		print(high);
		print(sortedSet.subSet(low, high));
		print(sortedSet.headSet(high));
		print(sortedSet.tailSet(low));
	}
}

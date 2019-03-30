/**
 * @Title CollectionDataTest.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月30日
 * @version 1.0
 */
package ch17;
import java.util.*;
import net.mindview.util.*;

class Government implements Generator<String>{
	String[] foundation = ("strange women lying in ponds distributing swords is no basis for a system of government").split(" ");
	private int index;
	public String next(){ return foundation[index++]; }
}


/**
 * @ClassName CollectionDataTest
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月30日
 * 
 */
public class CollectionDataTest {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>(
				new CollectionData<String>(new Government(), 15)
				);
		
		set.addAll(CollectionData.list(new Government(), 15));
		System.out.println(set);
	}
}

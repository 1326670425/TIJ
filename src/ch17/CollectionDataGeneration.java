/**
 * @Title CollectionDataGeneration.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月30日
 * @version 1.0
 */
package ch17;
import java.util.*;
import net.mindview.util.*;
/**
 * @ClassName CollectionDataGeneration
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月30日
 * 
 */
public class CollectionDataGeneration {
	  public static void main(String[] args) {
		    System.out.println(new ArrayList<String>(
		      CollectionData.list( // Convenience method
		        new RandomGenerator.String(9), 10)));
		    System.out.println(new HashSet<Integer>(
		      new CollectionData<Integer>(
		        new RandomGenerator.Integer(), 10)));
	}
}

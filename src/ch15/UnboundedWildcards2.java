/**
 * @Title UnboundedWildcards2.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月27日
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName UnboundedWildcards2
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月27日
 * 
 */
public class UnboundedWildcards2 {
	static Map map1;
	static Map<?, ?> map2;
	static Map<String, ?> map3;
	static void assign1(Map map){ map1 = map; }
	static void assign2(Map<?, ?> map){ map2 = map; }
	static void assign3(Map<String, ?> map){ map3 = map; }
	public static void main(String[] args) {
		assign1(new HashMap());
		assign2(new HashMap());
		// assign3(new HashMap());
		// Warning: Unchecked conversion. found: HashMap Required: Map<String, ?>
		assign1(new HashMap<String, Integer>());
		assign2(new HashMap<String, Integer>());
		assign3(new HashMap<String, Integer>());
	}
}

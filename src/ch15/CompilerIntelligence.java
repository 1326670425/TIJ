/**
 * @Title CompilerIntelligence.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月27日
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName CompilerIntelligence
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月27日
 * 
 */
public class CompilerIntelligence {
	public static void main(String[] args) {
		List<? extends Fruit> flist = Arrays.asList(new Apple());
		Apple a = (Apple)flist.get(0);
		flist.contains(new Apple());
		flist.indexOf(new Apple());
	}
}

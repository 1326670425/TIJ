/**
 * @Title CompilerIntelligence.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��27��
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName CompilerIntelligence
 * @Description TODO
 * @author �����
 * @date 2019��3��27��
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

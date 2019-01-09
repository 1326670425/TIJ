/**
 * @Title Statistics.java
 * @Package ch11
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * @version 1.0
 */
package ch11;
import java.util.*;
/**
 * @ClassName Statistics
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * 
 */
public class Statistics {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Map<Integer,Integer> m = 
				new HashMap<Integer,Integer>();
		for (int i = 0; i < 10000; i++) {
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1 : freq + 1);
		}
		System.out.println(m);
	}
}

/**
 * @Title SpecialCollector.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;

/**
 * @ClassName SpecialCollector
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class SpecialCollector {
	public static void main(String[] args) throws Exception {
		ArrayList<String> words = FileToWords.stream("src/streams/Cheese.dat")
									.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		words.stream().filter(s -> s.equals("cheese")).forEach(System.out::println);
	}
}

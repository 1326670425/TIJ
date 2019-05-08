/**
 * @Title Machine2.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.*;
import onjava.Operations;

/**
 * @ClassName Machine2
 * @Description Arrays.stream()将数组转为流
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class Machine2 {
	public static void main(String[] args) {
		Arrays.stream(new Operations[] {
			() -> Operations.show("Bing"),
			() -> Operations.show("Crack"),
			() -> Operations.show("Twist"),
			() -> Operations.show("Pop")
		}).forEach(Operations::execute);;
	}
}

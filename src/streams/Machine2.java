/**
 * @Title Machine2.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.*;
import onjava.Operations;

/**
 * @ClassName Machine2
 * @Description Arrays.stream()������תΪ��
 * @author �����
 * @date 2019��5��4��
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

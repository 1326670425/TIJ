/**
 * @Title StreamOfStreams.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.stream.*;

/**
 * @ClassName StreamOfStreams
 * @Description ��map()�ڼ������
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class StreamOfStreams {
	public static void main(String[] args) {
		Stream.of(1, 2, 3)
			.map(i -> Stream.of("Gonzo", "Kermit", "Beaker"))
			.map(e -> e.getClass().getName())
			.forEach(System.out::println);
	}
}

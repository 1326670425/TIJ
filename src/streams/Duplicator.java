/**
 * @Title Duplicator.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.stream.*;

/**
 * @ClassName Duplicator
 * @Description 创建包含相同对象的流，只需要传递一个生成对象的Lambda表达式
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class Duplicator {
	public static void main(String[] args) {
		Stream.generate(() -> "duplicate")
			  .limit(3)
			  .forEach(System.out::println);
	}
}

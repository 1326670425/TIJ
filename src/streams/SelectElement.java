/**
 * @Title SelectElement.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月5日
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;
import static streams.RandInts.*;

/**
 * @ClassName SelectElement
 * @Description 选择元素
 * @author 吴扬颉
 * @date 2019年5月5日
 * 
 */
public class SelectElement {
	public static void main(String[] args) {
		System.out.println(rands().findFirst().getAsInt());
		System.out.println(rands().parallel().findFirst().getAsInt());
		// 非并行流中，findAny()选择的其实是第一个元素，即使从定义上看是选择的任意元素
		System.out.println(rands().findAny().getAsInt());
		System.out.println(rands().parallel().findAny().getAsInt());
	}
}

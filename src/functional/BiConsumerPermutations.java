/**
 * @Title BiConsumerPermutations.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName BiConsumerPermutations
 * @Description 缺少基本类型的函数
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class BiConsumerPermutations {
	// %n 是自动跨平台的换行符，参考C/C++中的 \n
	static BiConsumer<Integer, Double> bicid = (i, d) -> System.out.format("%d, %f%n", i, d);
	static BiConsumer<Double, Integer> bicdi = (d, i) -> System.out.format("%d, %f%n", i, d);
	static BiConsumer<Integer, Long> bicil = (i, l) -> System.out.format("%d, %d%n", i, l);
	public static void main(String[] args) {
		bicid.accept(47, 11.34);
		bicdi.accept(22.45, 92);
		bicil.accept(1, 11L);
	}
}

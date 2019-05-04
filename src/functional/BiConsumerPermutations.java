/**
 * @Title BiConsumerPermutations.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName BiConsumerPermutations
 * @Description ȱ�ٻ������͵ĺ���
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class BiConsumerPermutations {
	// %n ���Զ���ƽ̨�Ļ��з����ο�C/C++�е� \n
	static BiConsumer<Integer, Double> bicid = (i, d) -> System.out.format("%d, %f%n", i, d);
	static BiConsumer<Double, Integer> bicdi = (d, i) -> System.out.format("%d, %f%n", i, d);
	static BiConsumer<Integer, Long> bicil = (i, l) -> System.out.format("%d, %d%n", i, l);
	public static void main(String[] args) {
		bicid.accept(47, 11.34);
		bicdi.accept(22.45, 92);
		bicil.accept(1, 11L);
	}
}

/**
 * @Title NumericStreamInfo.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��5��
 * @version 1.0
 */
package streams;

import static streams.RandInts.*;

/**
 * @ClassName NumericStreamInfo
 * @Description ��������Ϣ
 * @author �����
 * @date 2019��5��5��
 * 
 */
public class NumericStreamInfo {
	public static void main(String[] args) {
		System.out.println(rands().average().getAsDouble());
		System.out.println(rands().max().getAsInt());
		System.out.println(rands().min().getAsInt());
		System.out.println(rands().sum());
		System.out.println(rands().summaryStatistics());
	}
}

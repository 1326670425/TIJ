/**
 * @Title NumericStreamInfo.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月5日
 * @version 1.0
 */
package streams;

import static streams.RandInts.*;

/**
 * @ClassName NumericStreamInfo
 * @Description 数字流信息
 * @author 吴扬颉
 * @date 2019年5月5日
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

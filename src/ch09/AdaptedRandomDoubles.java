/**
 * @Title AdaptedRandomDoubles.java
 * @Package ch09
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * @version 1.0
 */
package ch09;

import java.nio.*;
import java.util.*;

/**
 * @ClassName AdaptedRandomDoubles
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * 
 */
public class AdaptedRandomDoubles implements Readable, RandomDoubles{
	private int count;
	public AdaptedRandomDoubles(int count) {
		this.count = count;
	}
	
	@Override
	public int read(CharBuffer cb) {
		if(count-- == 0)
			return -1;
		String result = Double.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(new AdaptedRandomDoubles(7));
		while(s.hasNextDouble()) {
			System.out.println(s.nextDouble() + " ");
		}
	}
}

/**
 * @Title FunctionWithWrapped.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName FunctionWithWrapped
 * @Description 使用包装类型
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class FunctionWithWrapped {
	public static void main(String[] args) {
		Function<Integer, Double> fid = i -> (double)i;
		IntToDoubleFunction fid2 = i -> i;
	}
}

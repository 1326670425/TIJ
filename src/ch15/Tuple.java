/**
 * @Title Tuple.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月25日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName Tuple
 * @Description 应用类型参数判断，设计更通用的tuple工具类
 * @author 吴扬颉
 * @date 2019年3月25日
 * 
 */
public class Tuple {
	public static <A, B> TwoTuple<A, B> tuple(A a, B b){
		return new TwoTuple<A, B>(a, b);
	}
}

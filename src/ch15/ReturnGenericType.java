/**
 * @Title ReturnGenericType.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName ReturnGenericType
 * @Description 如果一个类有个要返回T的方法，泛型就有帮助，他们可以返回确切的类型
 * @author 吴扬颉
 * @date 2019年3月26日
 * 
 */
public class ReturnGenericType<T extends HasF> {
	private T obj;
	public ReturnGenericType(T x){ obj = x; }
	public T get(){ return obj; }
}

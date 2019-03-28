/**
 * @Title SelfBoundingMethods.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName SelfBoundingMethods
 * @Description 自限定用于泛型方法，这可以防止这个方法被应用于除上述自限定参数以外的其它任何事物上去
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class SelfBoundingMethods {
	static <T extends SelfBounded<T>> T f(T arg){
		return arg.set(arg).get();
	}
	public static void main(String[] args) {
		A a = f(new A());
	}
}

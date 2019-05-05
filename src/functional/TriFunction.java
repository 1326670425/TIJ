/**
 * @Title TriFunction.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

/**
 * @ClassName TriFunction
 * @Description 多参数函数式接口
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
	R apply(T t, U u, V v);
}

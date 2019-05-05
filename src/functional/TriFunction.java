/**
 * @Title TriFunction.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

/**
 * @ClassName TriFunction
 * @Description ���������ʽ�ӿ�
 * @author �����
 * @date 2019��5��3��
 * 
 */
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
	R apply(T t, U u, V v);
}

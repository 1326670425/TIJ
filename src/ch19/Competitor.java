/**
 * @Title Competitor.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch19;

/**
 * @ClassName Competitor
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * 
 */
public interface Competitor<T extends Competitor<T>> {
	Outcome compete(T competitor);
}

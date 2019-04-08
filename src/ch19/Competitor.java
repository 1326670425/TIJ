/**
 * @Title Competitor.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch19;

/**
 * @ClassName Competitor
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public interface Competitor<T extends Competitor<T>> {
	Outcome compete(T competitor);
}

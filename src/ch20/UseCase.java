/**
 * @Title UseCase.java
 * @Package ch20
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch20;
import java.lang.annotation.*;
/**
 * @ClassName UseCase
 * @Description 跟踪项目中的用例
 * <p>注解元素可用的类型：所有基本类型；String；Class；enum；Annotation；以上类型的数组
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
	public int id();
	public String description() default "no description";
}

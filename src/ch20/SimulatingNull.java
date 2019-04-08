/**
 * @Title SimulatingNull.java
 * @Package ch20
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch20;
import java.lang.annotation.*;
/**
 * @ClassName SimulatingNull
 * @Description 元素要么具有默认值，要么使用注解提供元素的值
 * <p>非基本类型元素不能以null为其值。故自己定义特殊值，来表示某个元素不存在
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SimulatingNull {
	public int id() default -1;
	public String description() default "";
}

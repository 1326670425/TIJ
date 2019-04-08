/**
 * @Title DBTable.java
 * @Package ch20.database
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch20.database;
import java.lang.annotation.*;
/**
 * @ClassName DBTable
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
	public String name() default "";
}

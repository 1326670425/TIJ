/**
 * @Title DBTable.java
 * @Package ch20.database
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch20.database;
import java.lang.annotation.*;
/**
 * @ClassName DBTable
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * 
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
	public String name() default "";
}

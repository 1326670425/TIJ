/**
 * @Title Constraints.java
 * @Package ch20.database
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch20.database;
import java.lang.annotation.*;
/**
 * @ClassName Constraints
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * 
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraints {
	boolean primaryKey() default false;
	boolean allowNull() default true;
	boolean unique() default false;
}

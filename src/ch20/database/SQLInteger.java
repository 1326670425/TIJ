/**
 * @Title SQLInteger.java
 * @Package ch20.database
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch20.database;
import java.lang.annotation.*;
/**
 * @ClassName SQLInteger
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * 
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLInteger {
	String name() default "";
	Constraints constraints() default @Constraints;
}

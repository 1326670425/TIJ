/**
 * @Title Uniqueness.java
 * @Package ch20.database
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch20.database;

/**
 * @ClassName Uniqueness
 * @Description 嵌套注解，如果不指明元素值，则按照默认值赋值。
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public @interface Uniqueness {
	Constraints constraints() default @Constraints(unique = true);
}

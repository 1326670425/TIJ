/**
 * @Title Uniqueness.java
 * @Package ch20.database
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch20.database;

/**
 * @ClassName Uniqueness
 * @Description Ƕ��ע�⣬�����ָ��Ԫ��ֵ������Ĭ��ֵ��ֵ��
 * @author �����
 * @date 2019��4��8��
 * 
 */
public @interface Uniqueness {
	Constraints constraints() default @Constraints(unique = true);
}

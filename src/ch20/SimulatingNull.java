/**
 * @Title SimulatingNull.java
 * @Package ch20
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch20;
import java.lang.annotation.*;
/**
 * @ClassName SimulatingNull
 * @Description Ԫ��Ҫô����Ĭ��ֵ��Ҫôʹ��ע���ṩԪ�ص�ֵ
 * <p>�ǻ�������Ԫ�ز�����nullΪ��ֵ�����Լ���������ֵ������ʾĳ��Ԫ�ز�����
 * @author �����
 * @date 2019��4��8��
 * 
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SimulatingNull {
	public int id() default -1;
	public String description() default "";
}

/**
 * @Title UseCase.java
 * @Package ch20
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch20;
import java.lang.annotation.*;
/**
 * @ClassName UseCase
 * @Description ������Ŀ�е�����
 * <p>ע��Ԫ�ؿ��õ����ͣ����л������ͣ�String��Class��enum��Annotation���������͵�����
 * @author �����
 * @date 2019��4��8��
 * 
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
	public int id();
	public String description() default "no description";
}

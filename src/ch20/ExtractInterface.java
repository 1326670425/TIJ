/**
 * @Title ExtractInterface.java
 * @Package ch20
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch20;
import java.lang.annotation.*;
/**
 * @ClassName ExtractInterface
 * @Description ��ȡ��������
 * @author �����
 * @date 2019��4��8��
 * 
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ExtractInterface {
	public String value();
}

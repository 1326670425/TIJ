/**
 * @Title ExtractInterface.java
 * @Package ch20
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch20;
import java.lang.annotation.*;
/**
 * @ClassName ExtractInterface
 * @Description 提取公共方法
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ExtractInterface {
	public String value();
}

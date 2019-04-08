/**
 * @Title Testable.java
 * @Package ch20
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch20;
import net.mindview.atunit.*;
/**
 * @ClassName Testable
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public class Testable {
	public void execute(){
		System.out.println("Executing..");
	}
	@Test void testExecute(){ execute(); }
}
/*
 * Test.java
 * import java.lang.annotation.*;
 * @Target(ElementType.METHOD) // 注解应用于什么地方
 * @Retention(RetentionPolicy.RUNTIME) // 注解应用于什么级别：SOURCE（源代码）、CLASS（类）、RUNTIME（运行时）
 * public @interface Test{}
 */
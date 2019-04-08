/**
 * @Title AtUnitExternalTest.java
 * @Package ch20
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch20;
import net.mindview.atunit.*;
import net.mindview.util.*;
/**
 * @ClassName AtUnitExternalTest
 * @Description 通过继承，创建非嵌入式测试
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public class AtUnitExternalTest extends AtUnitExample1 {
	  @Test boolean _methodOne() {
	    return methodOne().equals("This is methodOne");
	  }
	  @Test boolean _methodTwo() { return methodTwo() == 2; }
	  public static void main(String[] args) throws Exception {
	    OSExecute.command(
	     "java net.mindview.atunit.AtUnit AtUnitExternalTest");
	  }
}

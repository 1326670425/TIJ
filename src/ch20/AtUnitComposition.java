/**
 * @Title AtUnitComposition.java
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
 * @ClassName AtUnitComposition
 * @Description 使用组合方式创建非嵌入式的测试
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public class AtUnitComposition {
	  AtUnitExample1 testObject = new AtUnitExample1();
	  @Test boolean _methodOne() {
	    return
	      testObject.methodOne().equals("This is methodOne");
	  }
	  @Test boolean _methodTwo() {
	    return testObject.methodTwo() == 2;
	  }
	  public static void main(String[] args) throws Exception {
	    OSExecute.command(
	     "java net.mindview.atunit.AtUnit AtUnitComposition");
	  }
	}

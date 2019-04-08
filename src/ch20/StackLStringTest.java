/**
 * @Title StackLStringTest.java
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
 * @ClassName StackLStringTest
 * @Description 将@Unit用于泛型：让测试类继承自一个泛型类的特定版本
 * <p>这种方式（继承）使我们失去了访问被测试类的private方法的能力。
 * 解决方式：要么改为protected，要么添加一个非private的@TestProperty方法，由它调用private方法
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public class StackLStringTest extends StackL<String> {
	  @Test void _push() {
	    push("one");
	    assert top().equals("one");
	    push("two");
	    assert top().equals("two");
	  }
	  @Test void _pop() {
	    push("one");
	    push("two");
	    assert pop().equals("two");
	    assert pop().equals("one");
	  }
	  @Test void _top() {
	    push("A");
	    push("B");
	    assert top().equals("B");
	    assert top().equals("B");
	  }
	  public static void main(String[] args) throws Exception {
	    OSExecute.command(
	      "java net.mindview.atunit.AtUnit StackLStringTest");
	  }
}

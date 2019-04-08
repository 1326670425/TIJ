/**
 * @Title HashSetTest.java
 * @Package ch20
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch20;
import java.util.*;
import net.mindview.atunit.*;
import net.mindview.util.*;
/**
 * @ClassName HashSetTest
 * @Description 非嵌入式+assert断言测试HashSet
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public class HashSetTest {
	  HashSet<String> testObject = new HashSet<String>();
	  @Test void initialization() {
	    assert testObject.isEmpty();
	  }
	  @Test void _contains() {
	    testObject.add("one");
	    assert testObject.contains("one");
	  }
	  @Test void _remove() {
	    testObject.add("one");
	    testObject.remove("one");
	    assert testObject.isEmpty();
	  }
	  public static void main(String[] args) throws Exception {
	    OSExecute.command(
	      "java net.mindview.atunit.AtUnit HashSetTest");
	  }
}

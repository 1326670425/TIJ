/**
 * @Title HashSetTest.java
 * @Package ch20
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch20;
import java.util.*;
import net.mindview.atunit.*;
import net.mindview.util.*;
/**
 * @ClassName HashSetTest
 * @Description ��Ƕ��ʽ+assert���Բ���HashSet
 * @author �����
 * @date 2019��4��8��
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

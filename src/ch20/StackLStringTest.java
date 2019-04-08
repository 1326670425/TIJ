/**
 * @Title StackLStringTest.java
 * @Package ch20
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch20;
import net.mindview.atunit.*;
import net.mindview.util.*;
/**
 * @ClassName StackLStringTest
 * @Description ��@Unit���ڷ��ͣ��ò�����̳���һ����������ض��汾
 * <p>���ַ�ʽ���̳У�ʹ����ʧȥ�˷��ʱ��������private������������
 * �����ʽ��Ҫô��Ϊprotected��Ҫô���һ����private��@TestProperty��������������private����
 * @author �����
 * @date 2019��4��8��
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

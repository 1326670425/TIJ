/**
 * @Title AtUnitExternalTest.java
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
 * @ClassName AtUnitExternalTest
 * @Description ͨ���̳У�������Ƕ��ʽ����
 * @author �����
 * @date 2019��4��8��
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

/**
 * @Title AtUnitComposition.java
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
 * @ClassName AtUnitComposition
 * @Description ʹ����Ϸ�ʽ������Ƕ��ʽ�Ĳ���
 * @author �����
 * @date 2019��4��8��
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

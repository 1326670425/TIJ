/**
 * @Title AtUnitExample1.java
 * @Package ch20
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch20;
import net.mindview.util.*;
import net.mindview.atunit.*;
/**
 * @ClassName AtUnitExample1
 * @Description ��Ԫ����
 * @author �����
 * @date 2019��4��8��
 * 
 */
public class AtUnitExample1 {
	public String methodOne(){
		return "This is methodOne";
	}
	public int methodTwo(){
		System.out.println("This is methodTwo");
		return 2;
	}
	@Test boolean methodOneTest(){
		return methodOne().getClass().equals("This is methodOne");
	}
	@Test boolean m2(){ return methodTwo() == 2; }
	@Test private boolean m3(){ return true; }
	@Test boolean failureTest(){ return false; }
	@Test boolean anotherDisappointment(){ return false; }
	public static void main(String[] args) throws Exception{
		OSExecute.command("java net.mindview.atunit.AtUnit AtUnitExample1");
	}
}

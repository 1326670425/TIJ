/**
 * @Title AtUnitExample1.java
 * @Package ch20
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch20;
import net.mindview.util.*;
import net.mindview.atunit.*;
/**
 * @ClassName AtUnitExample1
 * @Description 单元测试
 * @author 吴扬颉
 * @date 2019年4月8日
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

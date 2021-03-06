/**
 * @Title AtUnitExample5.java
 * @Package ch20
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch20;
import java.io.*;
import net.mindview.atunit.*;
import net.mindview.util.*;
/**
 * @ClassName AtUnitExample5
 * @Description static @TestObjectCleanup方法：执行一些清理工作
 * <p>清理方法会在每个测试结束后自动运行
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public class AtUnitExample5 {
	  private String text;
	  public AtUnitExample5(String text) { this.text = text; }
	  public String toString() { return text; }
	  @TestProperty static PrintWriter output;
	  @TestProperty static int counter;
	  @TestObjectCreate static AtUnitExample5 create() {
	    String id = Integer.toString(counter++);
	    try {
	      output = new PrintWriter("Test" + id + ".txt");
	    } catch(IOException e) {
	      throw new RuntimeException(e);
	    }
	    return new AtUnitExample5(id);
	  }
	  @TestObjectCleanup static void
	  cleanup(AtUnitExample5 tobj) {
	    System.out.println("Running cleanup");
	    output.close();
	  }
	  @Test boolean test1() {
	    output.print("test1");
	    return true;
	  }
	  @Test boolean test2() {
	    output.print("test2");
	    return true;
	  }
	  @Test boolean test3() {
	    output.print("test3");
	    return true;
	  }
	  public static void main(String[] args) throws Exception {
	    OSExecute.command(
	      "java net.mindview.atunit.AtUnit AtUnitExample5");
	  }
}

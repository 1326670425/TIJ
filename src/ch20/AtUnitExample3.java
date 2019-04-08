/**
 * @Title AtUnitExample3.java
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
 * @ClassName AtUnitExample3
 * @Description 对每个单元测试而言，@Unit都会使用默认的构造器，为该测试所属的类创建一个新的实例。并在此对象上运行测试，然后丢弃该对象，
 * 以避免对其它测试产生副作用。如此创造对象导致我们依赖于类的默认构造器。如果类没有默认构造器，或者新对象需要复杂的构造过程，可以创建一个static
 * 方法来专门负责构造对象，然后用@TestObjectCreate注解标记。
 * <p>加入了@TestObjectCreate注解的方法必须声明为static，且返回一个正在测试的类型对象
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public class AtUnitExample3 {
	  private int n;
	  public AtUnitExample3(int n) { this.n = n; }
	  public int getN() { return n; }
	  public String methodOne() {
	    return "This is methodOne";
	  }
	  public int methodTwo() {
	    System.out.println("This is methodTwo");
	    return 2;
	  }
	  @TestObjectCreate static AtUnitExample3 create() {
	    return new AtUnitExample3(47);
	  }
	  @Test boolean initialization() { return n == 47; }
	  @Test boolean methodOneTest() {
	    return methodOne().equals("This is methodOne");
	  }
	  @Test boolean m2() { return methodTwo() == 2; }
	  public static void main(String[] args) throws Exception {
	    OSExecute.command(
	      "java net.mindview.atunit.AtUnit AtUnitExample3");
	  }
}

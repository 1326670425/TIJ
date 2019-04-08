/**
 * @Title OverrideConstantSpecific.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch19;
import static net.mindview.util.Print.*;
/**
 * @ClassName OverrideConstantSpecific
 * @Description 覆盖常量相关方法
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public enum OverrideConstantSpecific {
	  NUT, BOLT,
	  WASHER {
	    void f() { print("Overridden method"); }
	  };
	  void f() { print("default behavior"); }
	  public static void main(String[] args) {
	    for(OverrideConstantSpecific ocs : values()) {
	      printnb(ocs + ": ");
	      ocs.f();
	    }
	  }
}

/**
 * @Title OverrideConstantSpecific.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch19;
import static net.mindview.util.Print.*;
/**
 * @ClassName OverrideConstantSpecific
 * @Description ���ǳ�����ط���
 * @author �����
 * @date 2019��4��8��
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

/**
 * @Title NotClasses.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch19;
import static net.mindview.util.Print.*;

enum LikeClasses {
  WINKEN { void behavior() { print("Behavior1"); } },
  BLINKEN { void behavior() { print("Behavior2"); } },
  NOD { void behavior() { print("Behavior3"); } };
  abstract void behavior();
}
/**
 * @ClassName NotClasses
 * @Description 不能将enum实例看做一个类型
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public class NotClasses {
	// void f1(LikeClasses.WINKEN instance) {} // Nope
}
/* Output:
Compiled from "NotClasses.java"
abstract class LikeClasses extends java.lang.Enum{
public static final LikeClasses WINKEN;

public static final LikeClasses BLINKEN;

public static final LikeClasses NOD;
...
*///:~
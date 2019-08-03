/**
 * @Title MultipleInheritance.java
 * @Package ch09
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * @version 1.0
 */
package ch09;
import java.util.*;

interface One {
    default void first() {
        System.out.println("first");
    }
}

interface Two {
    default void second() {
        System.out.println("second");
    }
}

interface Three {
    default void third() {
        System.out.println("third");
    }
}

class MI implements One, Two, Three {}

/**
 * @ClassName MultipleInheritance
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * 
 */
public class MultipleInheritance {
	public static void main(String[] args) {
		MI mi = new MI();
		mi.first();
		mi.second();
		mi.third();
	}
}

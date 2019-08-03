/**
 * @Title Jim.java
 * @Package ch09
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * @version 1.0
 */
package ch09;

import ch21.MainThread;

interface Jim1 {
    default void jim() {
        System.out.println("Jim1::jim");
    }
}

interface Jim2 {
    default void jim() {
        System.out.println("Jim2::jim");
    }
}

/**
 * @ClassName Jim
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * 
 */
public class Jim implements Jim1, Jim2 {
	@Override
	public void jim() {
		Jim2.super.jim();
	}
	public static void main(String[] args) {
		new Jim().jim();
	}
}

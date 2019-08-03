/**
 * @Title AbstractWithoutAbstracts.java
 * @Package ch09
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * @version 1.0
 */
package ch09;

abstract class Basic3 {
	int f() {
		return 111;
	}
}

/**
 * @ClassName AbstractWithoutAbstracts
 * @Description 不包含抽象方法的抽象类，阻止创建类的对象
 * @author 吴扬颉
 * @date 2019年7月27日
 * 
 */
public class AbstractWithoutAbstracts {
	// Basic b3 = new Basic3();
}

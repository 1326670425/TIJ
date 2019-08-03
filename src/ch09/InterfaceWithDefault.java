/**
 * @Title InterfaceWithDefault.java
 * @Package ch09
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * @version 1.0
 */
package ch09;

/**
 * @ClassName InterfaceWithDefault
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * 
 */
interface InterfaceWithDefault {
	void firstMethod();
	void secondMethod();
	
	default void newMethod() {
		System.out.println("newMethod");
	}
}

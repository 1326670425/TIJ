/**
 * @Title InterfaceWithDefault.java
 * @Package ch09
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * @version 1.0
 */
package ch09;

/**
 * @ClassName InterfaceWithDefault
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * 
 */
interface InterfaceWithDefault {
	void firstMethod();
	void secondMethod();
	
	default void newMethod() {
		System.out.println("newMethod");
	}
}

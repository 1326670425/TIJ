/**
 * @Title Applicator.java
 * @Package ch09.interfaceprocessor
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * @version 1.0
 */
package ch09.interfaceprocessor;

/**
 * @ClassName Applicator
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * 
 */
public class Applicator {
	public static void apply(Processor p, Object s) {
		System.out.println("Using Processor " + p.name());
		System.out.println(p.process(s));
	}
}

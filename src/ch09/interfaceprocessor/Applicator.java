/**
 * @Title Applicator.java
 * @Package ch09.interfaceprocessor
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * @version 1.0
 */
package ch09.interfaceprocessor;

/**
 * @ClassName Applicator
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * 
 */
public class Applicator {
	public static void apply(Processor p, Object s) {
		System.out.println("Using Processor " + p.name());
		System.out.println(p.process(s));
	}
}

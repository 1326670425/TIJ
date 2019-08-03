/**
 * @Title Processor.java
 * @Package ch09.interfaceprocessor
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * @version 1.0
 */
package ch09.interfaceprocessor;

/**
 * @ClassName Processor
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * 
 */
public interface Processor {
	default String name() {
		return getClass().getSimpleName();
	}
	Object process(Object input);
}

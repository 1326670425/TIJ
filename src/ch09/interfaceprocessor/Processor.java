/**
 * @Title Processor.java
 * @Package ch09.interfaceprocessor
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * @version 1.0
 */
package ch09.interfaceprocessor;

/**
 * @ClassName Processor
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * 
 */
public interface Processor {
	default String name() {
		return getClass().getSimpleName();
	}
	Object process(Object input);
}

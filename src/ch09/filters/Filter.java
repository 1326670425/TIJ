/**
 * @Title Filter.java
 * @Package ch09.filters
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * @version 1.0
 */
package ch09.filters;

/**
 * @ClassName Filter
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * 
 */
public class Filter {
	public String name() {
		return getClass().getSimpleName();
	}
	public Waveform process(Waveform input) {
		return input;
	}
}

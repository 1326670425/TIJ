/**
 * @Title Filter.java
 * @Package ch09.filters
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * @version 1.0
 */
package ch09.filters;

/**
 * @ClassName Filter
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
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

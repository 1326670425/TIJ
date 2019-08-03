/**
 * @Title Waveform.java
 * @Package ch09.filters
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * @version 1.0
 */
package ch09.filters;

/**
 * @ClassName Waveform
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * 
 */
public class Waveform {
	private static long counter;
	private final long id = counter++;
	
	@Override
	public String toString() {
		return "Waveform" + id;
	}
}

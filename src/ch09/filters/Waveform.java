/**
 * @Title Waveform.java
 * @Package ch09.filters
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * @version 1.0
 */
package ch09.filters;

/**
 * @ClassName Waveform
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
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

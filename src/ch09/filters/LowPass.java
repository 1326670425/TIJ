/**
 * @Title LowPass.java
 * @Package ch09.filters
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * @version 1.0
 */
package ch09.filters;

/**
 * @ClassName LowPass
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * 
 */
public class LowPass extends Filter {
	double cutoff;
	public LowPass(double cutoff) {
		this.cutoff = cutoff;
	}
	
	@Override
	public Waveform process(Waveform input) {
		return input; // Dummy processing �ƴ���
	}
}

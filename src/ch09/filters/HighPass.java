/**
 * @Title HighPass.java
 * @Package ch09.filters
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * @version 1.0
 */
package ch09.filters;

/**
 * @ClassName HighPass
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * 
 */
public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}

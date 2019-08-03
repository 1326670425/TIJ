/**
 * @Title HighPass.java
 * @Package ch09.filters
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * @version 1.0
 */
package ch09.filters;

/**
 * @ClassName HighPass
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
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

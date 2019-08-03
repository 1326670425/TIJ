/**
 * @Title BandPass.java
 * @Package ch09.filters
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * @version 1.0
 */
package ch09.filters;

/**
 * @ClassName BandPass
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * 
 */
public class BandPass extends Filter {
    double lowCutoff, highCutoff;

    public BandPass(double lowCut, double highCut) {
        lowCutoff = lowCut;
        highCutoff = highCut;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}

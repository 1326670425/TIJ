/**
 * @Title FilterProcessor.java
 * @Package ch09.interfaceprocessor
 * @Description TODO
 * @author �����
 * @date 2019��7��27��
 * @version 1.0
 */
package ch09.interfaceprocessor;
import ch09.filters.*;

class FilterAdapter implements Processor {
    Filter filter;

    FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}

/**
 * @ClassName FilterProcessor
 * @Description ���ô��룺��д������
 * @author �����
 * @date 2019��7��27��
 * 
 */
public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Applicator.apply(new FilterAdapter(new LowPass(1.0)), w);
        Applicator.apply(new FilterAdapter(new HighPass(2.0)), w);
        Applicator.apply(new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }
}

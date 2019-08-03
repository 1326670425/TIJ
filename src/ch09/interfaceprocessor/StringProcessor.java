/**
 * @Title StringProcessor.java
 * @Package ch09.interfaceprocessor
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年7月27日
 * @version 1.0
 */
package ch09.interfaceprocessor;
import java.util.*;

/**
 * @ClassName StringProcessor
 * @Description 复用代码：客户端程序员遵循接口编写类
 * @author 吴扬颉
 * @date 2019年7月27日
 * 
 */
interface StringProcessor extends Processor {
    @Override
    String process(Object input); // [1]
    String S = "If she weighs the same as a duck, she's made of wood"; // [2]

    static void main(String[] args) { // [3]
        Applicator.apply(new Upcase(), S);
        Applicator.apply(new Downcase(), S);
        Applicator.apply(new Splitter(), S);
    }
}

class Upcase implements StringProcessor {
    // 返回协变类型
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase implements StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter implements StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

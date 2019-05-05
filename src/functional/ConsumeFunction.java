/**
 * @Title ConsumeFunction.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import java.util.function.*;

class One {}
class Two {}

/**
 * @ClassName ConsumeFunction
 * @Description 要消费一个函数，消费函数需要在参数列表中正确描述函数类型
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class ConsumeFunction {
	static Two consume(Function<One, Two> onetwo) {
		return onetwo.apply(new One());
	}
	public static void main(String[] args) {
		Two two = consume(one -> new Two());
	}
}

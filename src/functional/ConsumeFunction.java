/**
 * @Title ConsumeFunction.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;

class One {}
class Two {}

/**
 * @ClassName ConsumeFunction
 * @Description Ҫ����һ�����������Ѻ�����Ҫ�ڲ����б�����ȷ������������
 * @author �����
 * @date 2019��5��3��
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

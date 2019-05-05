/**
 * @Title TransformFunction.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;

class I {
	@Override
	public String toString() {
		return "I";
	}
}

class O {
	@Override
	public String toString() {
		return "O";
	}
}

/**
 * @ClassName TransformFunction
 * @Description �������Ѻ��������º���
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class TransformFunction {
	static Function<I, O> transform(Function<I, O> in) {
		return in.andThen(o -> {
			System.out.println(o);
			return o;
		});
	}
	public static void main(String[] args) {
		Function<I, O> f2 = transform(i -> {
			System.out.println(i);
			return new O();
		});
		O o = f2.apply(new I());
	}
}

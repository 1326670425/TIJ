/**
 * @Title ProduceFunction.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;

// ʹ�ü̳У�Ϊר�ýӿڴ�������
interface FuncSS extends Function<String, String> {}

/**
 * @ClassName ProduceFunction
 * @Description Higher-order Function�����������Ѻ����ĺ���
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class ProduceFunction {
	// ʹ��Lambda���ʽ���ڷ����д����ͷ���һ������
	static FuncSS produce() {
		return s -> s.toLowerCase();
	}
	public static void main(String[] args) {
		FuncSS f = produce();
		System.out.println(f.apply("YELLING"));
	}
}

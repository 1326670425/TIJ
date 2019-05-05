/**
 * @Title MethodConversion.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;
import java.util.function.*;

class In1 {}
class In2 {}

/**
 * @ClassName MethodConversion
 * @Description �������ã�Function�ӿ�
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class MethodConversion {
	static void accept(In1 i1, In2 i2) {
		System.out.println("accept()");
	}
	static void someOtherName(In1 i1, In2 i2) {
		System.out.println("someOtherName()");
	}
	public static void main(String[] args) {
		BiConsumer<In1, In2> bic;
		
		bic = MethodConversion::accept;
		bic.accept(new In1(), new In2());
		// ��ʹ�ú����ӿ�ʱ�����Ʋ���Ҫ��ֻҪ�������ͺͷ���������ͬ��Java�����ӳ�䡣
		// ���ǵ���Ҫ�ýӿڵĺ���ʽ��������������ķ�����
		bic = MethodConversion::someOtherName;
		// bic.someOtherName(new In1(), new In2());
		bic.accept(new In1(), new In2());
	}
}

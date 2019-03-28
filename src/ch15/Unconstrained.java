/**
 * @Title Unconstrained.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;

class Other{}
class BasicOther extends BasicHolder<Other>{}

/**
 * @ClassName Unconstrained
 * @Description BasicHolder可以使用任何类型作为其泛型参数
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class Unconstrained {
	public static void main(String[] args) {
		BasicOther b = new BasicOther(), b2 = new BasicOther();
		b.set(new Other());
		Other other = b.get();
		b.f();
	}
}

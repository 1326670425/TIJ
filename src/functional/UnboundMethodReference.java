/**
 * @Title UnboundMethodReference.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

class X {
	String f() { return "X::f()"; }
}

interface MakeString {
	String make();
}

interface TransformX {
	String transfrom(X x);
}

/**
 * @ClassName UnboundMethodReference
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class UnboundMethodReference {
	public static void main(String[] args) {
		// 虽然make()和f()具有相同的方法签名，但也会报错。
		// 因为实际上还有一个隐藏参数this，不能在没有X对象的前提下调用f()，因此，
		// X::f表示未绑定的方法引用，因为它尚未“绑定”到对象。
		// MakeString ms = X::f;
		
		// 需要一个X对象
		TransformX sp = X::f;
		X x = new X();
		System.out.println(sp.transfrom(x));
		System.out.println(x.f());
	}
}

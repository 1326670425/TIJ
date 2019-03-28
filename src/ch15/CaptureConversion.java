/**
 * @Title CaptureConversion.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName CaptureConversion
 * @Description 捕获转换：如果向一个使用<?>的方法传递原生类型，那么对编译器来说，可能会推断出实际的类型参数，使得这个方法可以回调并调用另一个使用
 * 这个确切类型的方法。
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class CaptureConversion {
	static <T> void f1(Holder<T> holder){
		T t = holder.get();
		System.out.println(t.getClass().getSimpleName());
	}
	static void f2(Holder<?> holder){
		f1(holder);
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		// f1()中类型参数是确切，的没有通配符和边界。f2()中参数是个无界通配符，因此它看上去是未知的
		// 但是在f2()中调用f1()，参数类型在调用f2()的时候被捕获，因此可以用于f1()中
		Holder raw = new Holder<Integer>(1);
		f1(raw);
		f2(raw);
		Holder rawBasic = new Holder();
		rawBasic.set(new Object());
		f2(rawBasic);
		Holder<?> wildcarded = new Holder<Double>(1.0);
		f2(wildcarded);
	}
}

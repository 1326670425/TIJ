/**
 * @Title GenericMethods.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月25日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName GenericMethods
 * @Description 泛型方法示例(泛型参数列表置于返回值前面)，泛型方法在使用时，通常不必指明参数类型，因为编译器会为我们找出具体的类型，这称为类型参数推断。
 * @author 吴扬颉
 * @date 2019年3月25日
 * 
 */
public class GenericMethods {
	public <T> void f(T x){
		System.out.println(x.getClass().getName());
	}
	public <A, B, C> void g(A a, B b, C c){
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
	}
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		gm.f("");
		gm.f(1);
		gm.f(1.0);
		gm.f(1.0F);
		gm.f('c');
		gm.f(gm);
		gm.g(1, "", gm);
	}
}

/**
 * @Title OrdinaryArguments.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;

class OrdinarySetter{
	void set(Base base){
		System.out.println("OrdinarySetter.set(Base)");
	}
}

class DerivedSetter extends OrdinarySetter{
	void set(Derived derived){
		System.out.println("DerivedSetter.set(Derived)");
	}
}


/**
 * @ClassName OrdinaryArguments
 * @Description 在非泛型代码中，参数类型不能随子类类型发生变化
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class OrdinaryArguments {
	public static void main(String[] args) {
		Base base = new Base();
		Derived derived = new Derived();
		DerivedSetter ds = new DerivedSetter();
		// 两个set都是合法的，因此DerivedSetter.set()没有覆盖OrdinarySetter.set()，而是重载了这个方法。
		// 从输出中可得，DerivedSetter中有两个方法，因此基类版本仍旧是可用的，因此可以证明它被重载过
		ds.set(derived);
		ds.set(base);
	}
}

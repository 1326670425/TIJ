/**
 * @Title PlainGenericInteritance.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;

class GenericSetter<T>{
	void set(T arg){
		System.out.println("GenericSetter.set(Base)");
	}
}

class DerivedGS extends GenericSetter<Base>{
	void set(Derived derived){
		System.out.println("DerivedGS.set(Derived)");
	}
}

/**
 * @ClassName PlainGenericInteritance
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class PlainGenericInteritance {
	public static void main(String[] args) {
		Base base = new Base();
		Derived derived = new Derived();
		DerivedGS dgs = new DerivedGS();
		dgs.set(derived);
		dgs.set(base); // 重载，不是覆盖
	}
}

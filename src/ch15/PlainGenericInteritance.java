/**
 * @Title PlainGenericInteritance.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
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
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class PlainGenericInteritance {
	public static void main(String[] args) {
		Base base = new Base();
		Derived derived = new Derived();
		DerivedGS dgs = new DerivedGS();
		dgs.set(derived);
		dgs.set(base); // ���أ����Ǹ���
	}
}

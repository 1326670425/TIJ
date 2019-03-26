/**
 * @Title ErasureAndInheritance.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * @version 1.0
 */
package ch15;

class GenericBase<T>{
	private T element;
	public void set(T arg){ arg = element; }
	public T get(){ return element; }
}

class Derived1<T> extends GenericBase<T> {}
class Derived2 extends GenericBase {}
// class Derived3 extends GenericBase<?>{}
//Strange error:
//  unexpected type found : ?
//  required: class or interface without bounds
/**
 * @ClassName ErasureAndInheritance
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * 
 */
public class ErasureAndInheritance {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Derived2 d2 = new Derived2();
		Object obj = d2.get();
		// 调用set()会出现警告
		d2.set(obj);
	}
}

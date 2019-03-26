/**
 * @Title ErasureAndInheritance.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
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
 * @author �����
 * @date 2019��3��26��
 * 
 */
public class ErasureAndInheritance {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Derived2 d2 = new Derived2();
		Object obj = d2.get();
		// ����set()����־���
		d2.set(obj);
	}
}

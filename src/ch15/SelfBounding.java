/**
 * @Title SelfBounding.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * @version 1.0
 */
package ch15;


class SelfBounded<T extends SelfBounded<T>>{
	T element;
	SelfBounded<T> set(T arg){
		element = arg;
		return this;
	}
	T get(){ return element; }
}
// ���޶������ģ�����Ҫ���ڼ̳й�ϵ�У�������ʹ������ࡣ�����Ա�֤���Ͳ������������ڱ����������ͬ
class A extends SelfBounded<A>{}
class B extends SelfBounded<A>{}

class C extends SelfBounded<C>{
	C setAndGet(C arg){ set(arg); return get(); }
}

class D{}
// ������ô��
// class E extends SelfBounded<D>{}
// Type parameter D is not within its bound
// Also, you can do this, so you can't force the idiom
class F extends SelfBounded{}

/**
 * @ClassName SelfBounding
 * @Description ���޶�����ȡ����Ĳ��裬ǿ�Ʒ��͵����Լ��ı߽������ʹ��
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class SelfBounding {
	public static void main(String[] args) {
		A a = new A();
		a.set(new A());
		a = a.set(new A()).get();
		a = a.get();
		C c = new C();
		c = c.setAndGet(new C());
	}
}

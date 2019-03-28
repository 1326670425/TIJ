/**
 * @Title NotSelfBounded.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * @version 1.0
 */
package ch15;

class A2 extends NotSelfBounded<A2>{}
class B2 extends NotSelfBounded<A2>{}

class C2 extends NotSelfBounded<C2>{
	C2 setAndGet(C2 arg){ set(arg); return get(); }
}
class D2{}
class E2 extends NotSelfBounded<D2>{}

/**
 * @ClassName NotSelfBounded
 * @Description ��ʹ�����޶�
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class NotSelfBounded<T> {
	T element;
	NotSelfBounded<T> set(T arg){
		element = arg;
		return this;
	}
	T get(){ return element; }
}

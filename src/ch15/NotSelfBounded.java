/**
 * @Title NotSelfBounded.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
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
 * @Description 不使用自限定
 * @author 吴扬颉
 * @date 2019年3月28日
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

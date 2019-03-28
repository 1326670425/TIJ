/**
 * @Title SelfBounding.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
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
// 自限定所做的，就是要求在继承关系中，像这样使用这个类。它可以保证类型参数必须与正在被定义的类相同
class A extends SelfBounded<A>{}
class B extends SelfBounded<A>{}

class C extends SelfBounded<C>{
	C setAndGet(C arg){ set(arg); return get(); }
}

class D{}
// 不能这么做
// class E extends SelfBounded<D>{}
// Type parameter D is not within its bound
// Also, you can do this, so you can't force the idiom
class F extends SelfBounded{}

/**
 * @ClassName SelfBounding
 * @Description 自限定将采取额外的步骤，强制泛型当做自己的边界参数来使用
 * @author 吴扬颉
 * @date 2019年3月28日
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

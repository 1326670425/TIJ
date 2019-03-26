/**
 * @Title FactoryIConstraint.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * @version 1.0
 */
package ch15;

interface FactoryI<T>{
	T create();
}

class Foo2<T>{
	private T x;
	public <F extends FactoryI<T>> Foo2(F FactoryI){
		x = FactoryI.create();
	}
}

class IntegerFactory implements FactoryI<Integer>{
	public Integer create(){
		return new Integer(0);
	}
}

class Widget{
	public static class Factory implements FactoryI<Widget>{
		public Widget create(){
			return new Widget();
		}
	}
}
/**
 * @ClassName FactoryIConstraint
 * @Description 使用显式工厂并限制类型，只能接受实现了这个工厂的类
 * @author 吴扬颉
 * @date 2019年3月26日
 * 
 */
public class FactoryConstraint {
	public static void main(String[] args) {
		new Foo2<Integer>(new IntegerFactory());
		new Foo2<Widget>(new Widget.Factory());
	}
}

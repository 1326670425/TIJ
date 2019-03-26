/**
 * @Title FactoryIConstraint.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
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
 * @Description ʹ����ʽ�������������ͣ�ֻ�ܽ���ʵ���������������
 * @author �����
 * @date 2019��3��26��
 * 
 */
public class FactoryConstraint {
	public static void main(String[] args) {
		new Foo2<Integer>(new IntegerFactory());
		new Foo2<Widget>(new Widget.Factory());
	}
}

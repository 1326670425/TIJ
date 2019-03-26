/**
 * @Title CreatorGeneric.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * @version 1.0
 */
package ch15;

abstract class GenericWithCreate<T>{
	final T element;
	GenericWithCreate(){ element = create(); }
	abstract T create();
}

class X{}
class Creator extends GenericWithCreate<X>{
	X create(){ return new X(); }
	void f(){
		System.out.println(element.getClass().getSimpleName());
	}
}

/**
 * @ClassName CreatorGeneric
 * @Description ģ�巽�����ģʽ
 * @author �����
 * @date 2019��3��26��
 * 
 */
public class CreatorGeneric<T> {
	public static void main(String[] args) {
		Creator c = new Creator();
		c.f();
	}
}

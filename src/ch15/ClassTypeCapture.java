/**
 * @Title ClassTypeCapture.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * @version 1.0
 */
package ch15;

class Building{}
class House extends Building{}


/**
 * @ClassName ClassTypeCapture
 * @Description �������ͱ�ǩ��ʹ��isInstance()
 * @author �����
 * @date 2019��3��26��
 * 
 */
public class ClassTypeCapture<T> {
	Class<T> kind;
	public ClassTypeCapture(Class<T> kind){ this.kind = kind; }
	public boolean f(Object arg){ return kind.isInstance(arg); }
	public static void main(String[] args) {
		ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<Building>(Building.class);
		System.out.println(ctt1.f(new Building()));
		System.out.println(ctt1.f(new House()));
		ClassTypeCapture<House> ctt2 = new ClassTypeCapture<House>(House.class);
		System.out.println(ctt2.f(new Building()));
		System.out.println(ctt2.f(new House()));
	}
}

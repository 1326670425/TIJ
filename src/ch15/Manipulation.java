/**
 * @Title Manipulation.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * @version 1.0
 */
package ch15;

class Manipulator<T>{
	private T obj;
	public Manipulator(T x){ obj = x; }
	
	public void manipulate(){
		// 此处不能通过编译，Java不知道obj对象有没有f()方法
		// obj.f();
	}
}

/**
 * @ClassName Manipulation
 * @Description 由于Java有类型擦除，所以该类不能被编译通过
 * @author 吴扬颉
 * @date 2019年3月26日
 * 
 */
public class Manipulation {
	public static void main(String[] args) {
		HasF hf = new HasF();
		Manipulator<HasF> manipulator = new Manipulator<HasF>(hf);
		manipulator.manipulate();
	}
}

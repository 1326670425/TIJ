/**
 * @Title Manipulation.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * @version 1.0
 */
package ch15;

class Manipulator<T>{
	private T obj;
	public Manipulator(T x){ obj = x; }
	
	public void manipulate(){
		// �˴�����ͨ�����룬Java��֪��obj������û��f()����
		// obj.f();
	}
}

/**
 * @ClassName Manipulation
 * @Description ����Java�����Ͳ��������Ը��಻�ܱ�����ͨ��
 * @author �����
 * @date 2019��3��26��
 * 
 */
public class Manipulation {
	public static void main(String[] args) {
		HasF hf = new HasF();
		Manipulator<HasF> manipulator = new Manipulator<HasF>(hf);
		manipulator.manipulate();
	}
}

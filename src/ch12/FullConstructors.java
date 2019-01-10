/**
 * @Title FullConstructors.java
 * @Package ch12
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * @version 1.0
 */
package ch12;

class MyException extends Exception{
	public MyException(){}
	public MyException(String msg){ super(msg); }
}

/**
 * @ClassName FullConstructors
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * 
 */
public class FullConstructors {
	public static void f() throws MyException{
		System.out.println("Throwing MyException from f()");
		throw new MyException();
	}
	public static void g() throws MyException{
		System.out.println("Throwing MyException from g()");
		throw new MyException();
	}
	public static void main(String[] args) {
		try{
			f();
		}catch(MyException e){
			e.printStackTrace(System.out);// �޲ΰ汾�����Ϣ�������׼������
		}
		try{
			g();
		}catch(MyException e){
			e.printStackTrace(System.out);
		}
	}
}

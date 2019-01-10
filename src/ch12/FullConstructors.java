/**
 * @Title FullConstructors.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
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
 * @author 吴扬颉
 * @date 2019年1月10日
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
			e.printStackTrace(System.out);// 无参版本会把消息输出到标准错误流
		}
		try{
			g();
		}catch(MyException e){
			e.printStackTrace(System.out);
		}
	}
}

/**
 * @Title Rethrowing.java
 * @Package ch12
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * @version 1.0
 */
package ch12;

/**
 * @ClassName Rethrowing
 * @Description ��ʾ fillInStackTrace():����fillInStackTrace()����һ�оͳ����쳣���·�������
 * @author �����
 * @date 2019��1��10��
 * 
 */
public class Rethrowing {
	public static void f() throws Exception{
		System.out.println("originating the exception in f()");
		throw new Exception("thrown from f()");
	}
	public static void g() throws Exception{
		try{
			f();
		}catch(Exception e){
			System.out.println("Inside g(),e.printStackTrace()");
			e.printStackTrace(System.out);
			throw e;
		}
	}
	public static void h() throws Exception{
		try{
			f();
		}catch(Exception e){
			System.out.println("Inside h(),e.printStackTrace()");
			e.printStackTrace(System.out);
			throw (Exception)e.fillInStackTrace();
		}
	}
	public static void main(String[] args) {
		try{
			g();
		}catch(Exception e){
			System.out.println("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
		try{
			h();
		}catch(Exception e){
			System.out.println("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
}

/**
 * @Title Rethrowing.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * @version 1.0
 */
package ch12;

/**
 * @ClassName Rethrowing
 * @Description 演示 fillInStackTrace():调用fillInStackTrace()的那一行就成了异常的新发生地了
 * @author 吴扬颉
 * @date 2019年1月10日
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

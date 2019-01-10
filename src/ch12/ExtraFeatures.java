/**
 * @Title ExtraFeatures.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * @version 1.0
 */
package ch12;

class MyException2 extends Exception{
	private int x;
	public MyException2(){}
	public MyException2(String msg){ super(msg); }
	public MyException2(String msg, int x){
		super(msg);
		this.x = x;
	}
	public int val(){ return x; }
	//对于异常类来说，getMessage()方法有点类似于toString()方法
	public String getMessage(){
		return "Detail Message: " + x + " " + super.getMessage();
	}
}

/**
 * @ClassName ExtraFeatures
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * 
 */
public class ExtraFeatures {
	public static void f() throws MyException2{
		System.out.println("Throwing MyException2 from f()");
		throw new MyException2();
	}
	public static void g() throws MyException2{
		System.out.println("Throwing MyException2 from g()");
		throw new MyException2("Originated in g()");
	}
	public static void h() throws MyException2{
		System.out.println("Throwing MyException2 from h()");
		throw new MyException2("Originated in h()", 47);
	}
	public static void main(String[] args) {
		try{
			f();
		}catch(MyException2 e){
			e.printStackTrace(System.out);
		}
		try{
			g();
		}catch(MyException2 e){
			e.printStackTrace(System.out);
		}
		try{
			h();
		}catch(MyException2 e){
			e.printStackTrace(System.out);
			System.out.println("e.val() = " + e.val());
		}
	}
}

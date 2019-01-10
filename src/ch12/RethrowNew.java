/**
 * @Title RethrowNew.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * @version 1.0
 */
package ch12;

class OneException extends Exception{
	public OneException(String s){ super(s); }
}

class TwoException extends Exception{
	public TwoException(String s){ super(s); }
}
/**
 * @ClassName RethrowNew
 * @Description 在捕获异常之后，抛出另一种异常
 * @author 吴扬颉
 * @date 2019年1月10日
 * 
 */
public class RethrowNew {
	public static void f() throws OneException{
		System.out.println("originating  the exception in f()");
		throw new OneException("thrown from f()");
	}
	public static void main(String[] args) {
		try{
			try{
				f();
			}catch(OneException e){
				System.out.println("Caught in inner try, e.printStackTrace()");
				e.printStackTrace(System.out);
				throw new TwoException("from inner try");
			}
		}catch(TwoException e){//该异常只知道自己来源于main()
			System.out.println("Caught in outer try, e.printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
}

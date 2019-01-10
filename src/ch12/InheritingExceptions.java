/**
 * @Title InheritingExceptions.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * @version 1.0
 */
package ch12;

class SimpleException extends Exception{}

/**
 * @ClassName InheritingExceptions
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * 
 */
public class InheritingExceptions extends Exception{
	public void f() throws SimpleException{
		System.out.println("Throw SimpleException from f()");
		throw new SimpleException();
	}
	public static void main(String[] args) {
		InheritingExceptions sed = new InheritingExceptions();
		try{
			sed.f();
		}catch(SimpleException e){
			System.out.println("Caught it!");
		}
	}
}

/**
 * @Title InheritingExceptions.java
 * @Package ch12
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * @version 1.0
 */
package ch12;

class SimpleException extends Exception{}

/**
 * @ClassName InheritingExceptions
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
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

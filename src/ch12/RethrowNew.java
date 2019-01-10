/**
 * @Title RethrowNew.java
 * @Package ch12
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
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
 * @Description �ڲ����쳣֮���׳���һ���쳣
 * @author �����
 * @date 2019��1��10��
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
		}catch(TwoException e){//���쳣ֻ֪���Լ���Դ��main()
			System.out.println("Caught in outer try, e.printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
}

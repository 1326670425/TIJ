/**
 * @Title TurnOffChecking.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * @version 1.0
 */
package ch12;
import java.io.*;

class WrapCheckedException{
	void throwRuntimeException(int type){
		try{
			switch(type){
			case 0: throw new FileNotFoundException();
			case 1: throw new IOException();
			case 2: throw new RuntimeException("Where am I?");
			default: return;
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}

class SomeOtherException extends Exception{}

/**
 * @ClassName TurnOffChecking
 * @Description 当不想把异常吞了，又不想打印一些无用信息，可以把受检查的异常包装进RuntimeException。
 * 这样可以不写try-catch语句，直接忽略异常。同时还可以用getCause()捕获并处理特定的异常
 * @author 吴扬颉
 * @date 2019年1月10日
 * 
 */
public class TurnOffChecking {
	public static void main(String[] args) {
		WrapCheckedException wce = new WrapCheckedException();
		// You can call throwRuntimeException() without a try block,
		// and let RuntimeExcepitons leave the method
		wce.throwRuntimeException(3);
		// 或者你可以选择捕获异常
		for (int i = 0; i < 4; i++) {
			try{
				if(i < 3)
					wce.throwRuntimeException(i);
				else
					throw new SomeOtherException();
			}catch(SomeOtherException e){
				System.out.println("SomeOtherException: " + e);
			}catch(RuntimeException ee){
				try{
					throw ee.getCause();
				}catch(FileNotFoundException e){
					System.out.println("FileNotFoundException: " + e);
				}catch(IOException e){
					System.out.println("IOException: " + e);
				}catch(Throwable e){
					System.out.println("Throwable: " + e);
				}
				System.out.println("RuntimeException: " + ee);
			}
		}
	}
}

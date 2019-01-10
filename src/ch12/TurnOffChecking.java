/**
 * @Title TurnOffChecking.java
 * @Package ch12
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
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
 * @Description ��������쳣���ˣ��ֲ����ӡһЩ������Ϣ�����԰��ܼ����쳣��װ��RuntimeException��
 * �������Բ�дtry-catch��䣬ֱ�Ӻ����쳣��ͬʱ��������getCause()���񲢴����ض����쳣
 * @author �����
 * @date 2019��1��10��
 * 
 */
public class TurnOffChecking {
	public static void main(String[] args) {
		WrapCheckedException wce = new WrapCheckedException();
		// You can call throwRuntimeException() without a try block,
		// and let RuntimeExcepitons leave the method
		wce.throwRuntimeException(3);
		// ���������ѡ�񲶻��쳣
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

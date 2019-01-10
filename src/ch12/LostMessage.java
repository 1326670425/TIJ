/**
 * @Title LostMessage.java
 * @Package ch12
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * @version 1.0
 */
package ch12;

class VeryImportantException extends Exception{
	public String toString(){
		return "A very important exception!";
	}
}

class HoHumException extends Exception{
	public String toString(){
		return "A trivial exception";
	}
}

/**
 * @ClassName LostMessage
 * @Description ��ʱ��ʹ��finally�ᶪʧ�쳣�����д�finally��return.
 * @author �����
 * @date 2019��1��10��
 * 
 */
public class LostMessage {
	void f() throws VeryImportantException{
		throw new VeryImportantException();
	}
	void dispose() throws HoHumException{
		throw new HoHumException();
	}
	public static void main(String[] args) {
		try{
			LostMessage lm = new LostMessage();
			try{
				lm.f();
			}finally{
				lm.dispose();
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

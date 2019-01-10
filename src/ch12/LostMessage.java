/**
 * @Title LostMessage.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
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
 * @Description 有时候使用finally会丢失异常。还有从finally中return.
 * @author 吴扬颉
 * @date 2019年1月10日
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

/**
 * @Title DatabaseException.java
 * @Package ch13
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月22日
 * @version 1.0
 */
package ch13;

/**
 * @ClassName DatabaseException
 * @Description String.format().String.format()内部，也是创建一个Formatter对象，然后将传入的参数转给该Formatter
 * @author 吴扬颉
 * @date 2019年1月22日
 * 
 */
public class DatabaseException extends Exception{
	public DatabaseException(int transactionID, int queryID, String message){
		super(String.format("(t%d, q%d) %s", transactionID, queryID, message));
	}
	public static void main(String[] args) {
		try{
			throw new DatabaseException(3, 4, "Write failed");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

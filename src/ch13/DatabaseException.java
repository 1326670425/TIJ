/**
 * @Title DatabaseException.java
 * @Package ch13
 * @Description TODO
 * @author �����
 * @date 2019��1��22��
 * @version 1.0
 */
package ch13;

/**
 * @ClassName DatabaseException
 * @Description String.format().String.format()�ڲ���Ҳ�Ǵ���һ��Formatter����Ȼ�󽫴���Ĳ���ת����Formatter
 * @author �����
 * @date 2019��1��22��
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

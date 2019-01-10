/**
 * @Title ExceptionMethods.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * @version 1.0
 */
package ch12;

/**
 * @ClassName ExceptionMethods
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * 
 */
public class ExceptionMethods {
	public static void main(String[] args) {
		try{
			throw new Exception("My Exception");
		}catch(Exception e){
			System.out.println("Caught Exception");
			System.out.println("getMessage(): " + e.getMessage());
			System.out.println("getLocalizedMessage(): " + e.getLocalizedMessage());
			System.out.println("toString(): " + e.toString());
			System.out.println("printStackTrace(): ");
			e.printStackTrace(System.out);
		}
	}
}

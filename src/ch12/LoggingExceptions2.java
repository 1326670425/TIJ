/**
 * @Title LoggingExceptions2.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * @version 1.0
 */
package ch12;
import java.util.logging.*;
import java.io.*;
/**
 * @ClassName LoggingExceptions2
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * 
 */
public class LoggingExceptions2 {
	private static Logger logger = 
			Logger.getLogger("LoggingExceptions2");
	static void logException(Exception e){
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	public static void main(String[] args) {
		try{
			throw new NullPointerException();
		}catch(NullPointerException e){
			logException(e);
		}
	}
}

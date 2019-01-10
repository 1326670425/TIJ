/**
 * @Title LoggingExceptions2.java
 * @Package ch12
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * @version 1.0
 */
package ch12;
import java.util.logging.*;
import java.io.*;
/**
 * @ClassName LoggingExceptions2
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
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

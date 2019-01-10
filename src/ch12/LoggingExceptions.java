/**
 * @Title LoggingExceptions.java
 * @Package ch12
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * @version 1.0
 */
package ch12;
import java.util.logging.*;
import java.io.*;

class LoggingException extends Exception{
	private static Logger logger = 
			Logger.getLogger("LoggingException");
	public LoggingException(){
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

/**
 * @ClassName LoggingExceptions
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * 
 */
public class LoggingExceptions {
	public static void main(String[] args) {
		try{
			throw new LoggingException();
		}catch(LoggingException e){
			System.err.println("Caught " + e);
		}
		try{
			throw new LoggingException();
		}catch(LoggingException e){
			System.err.println("Caught " + e);
		}
	}
}

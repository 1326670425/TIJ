/**
 * @Title EnvironmentVariables.java
 * @Package ch11
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * @version 1.0
 */
package ch11;
import java.util.*;
/**
 * @ClassName EnvironmentVariables
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * 
 */
public class EnvironmentVariables {
	public static void main(String[] args) {
		for(Map.Entry entry : System.getenv().entrySet())
			System.out.println(entry.getKey() + ": " + entry.getValue());
	}
}

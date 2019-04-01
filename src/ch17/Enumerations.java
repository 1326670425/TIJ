/**
 * @Title Enumerations.java
 * @Package ch17
 * @Description TODO
 * @author �����
 * @date 2019��4��1��
 * @version 1.0
 */
package ch17;
import java.util.*;
import net.mindview.util.*;
/**
 * @ClassName Enumerations
 * @Description Java1.0/1.1������
 * @author �����
 * @date 2019��4��1��
 * 
 */
public class Enumerations {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(Countries.names(10));
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		// Produce an Enumeration from a Collection
		e = Collections.enumeration(new ArrayList<String>());
	}
}

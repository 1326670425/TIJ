/**
 * @Title NeedCasting.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * @version 1.0
 */
package ch15;
import java.io.*;
import java.util.*;
/**
 * @ClassName NeedCasting
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class NeedCasting {
	@SuppressWarnings("unchecked")
	public void f(String[] args) throws Exception{
		// readObject()�޷�֪�����ڶ�ȡʲô�����Ա���ת��
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
		List<Widget> shapes = (List<Widget>)in.readObject();
	}
}

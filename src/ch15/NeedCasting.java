/**
 * @Title NeedCasting.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;
import java.io.*;
import java.util.*;
/**
 * @ClassName NeedCasting
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class NeedCasting {
	@SuppressWarnings("unchecked")
	public void f(String[] args) throws Exception{
		// readObject()无法知道正在读取什么，所以必须转型
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
		List<Widget> shapes = (List<Widget>)in.readObject();
	}
}

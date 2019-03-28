/**
 * @Title ClassCasting.java
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
 * @ClassName ClassCasting
 * @Description 新的转型形式：通过泛型类来转型
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class ClassCasting {
	@SuppressWarnings("unchecked")
	public void f(String[] args) throws Exception{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
		// 无法编译
		// List<Widget> lw1 = List<Widget>.class.cast(in.readObject());
		List<Widget> lw2 = List.class.cast(in.readObject());
	}
}

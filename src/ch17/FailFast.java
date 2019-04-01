/**
 * @Title FailFast.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月1日
 * @version 1.0
 */
package ch17;
import java.util.*;
/**
 * @ClassName FailFast
 * @Description 快速报错机制：防止多个线程同时修改同一个容器的内容
 * <p>ConcurrentHashMap、CopyOnWriteArrayList和CopyOnWriteArraySet都使用了可以避免这种异常的技术
 * @author 吴扬颉
 * @date 2019年4月1日
 * 
 */
public class FailFast {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		Iterator<String> it = c.iterator();
		c.add("An object");
		try{
			String s = it.next();
		}catch(ConcurrentModificationException e){
			System.out.println(e);
		}
	}
}

/**
 * @Title SimpleQueue.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��29��
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName SimpleQueue
 * @Description TODO
 * @author �����
 * @date 2019��3��29��
 * 
 */
public class SimpleQueue<T> implements Iterable<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	public void add(T t){ storage.offer(t); }
	public T get(){ return storage.pop(); }
	public Iterator<T> iterator(){
		return storage.iterator();
	}
}

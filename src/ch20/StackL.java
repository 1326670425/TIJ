/**
 * @Title StackL.java
 * @Package ch20
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch20;
import java.util.*;
/**
 * @ClassName StackL
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * 
 */
public class StackL<T> {
	private LinkedList<T> list = new LinkedList<T>();
	public void push(T v){ list.addFirst(v); }
	public T top(){ return list.getFirst(); }
	public T pop(){ return list.removeFirst(); }
}

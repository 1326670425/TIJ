/**
 * @Title BasicHolder.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName BasicHolder
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class BasicHolder<T> {
	T element;
	void set(T arg){ element = arg; }
	T get(){ return element; }
	void f(){
		System.out.println(element.getClass().getSimpleName());
	}
}

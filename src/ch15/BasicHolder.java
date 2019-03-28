/**
 * @Title BasicHolder.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName BasicHolder
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
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

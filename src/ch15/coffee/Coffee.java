/**
 * @Title Coffee.java
 * @Package ch15.coffee
 * @Description TODO
 * @author �����
 * @date 2019��3��24��
 * @version 1.0
 */
package ch15.coffee;

/**
 * @ClassName Coffee
 * @Description TODO
 * @author �����
 * @date 2019��3��24��
 * 
 */
public class Coffee {
	private static long counter = 0;
	private final long id = counter++;
	public String toString(){
		return getClass().getSimpleName() + " " + id;
	}
}

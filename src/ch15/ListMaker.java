/**
 * @Title ListMaker.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * @version 1.0
 */
package ch15;
import java.util.*;

/**
 * @ClassName ListMaker
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * 
 */
public class ListMaker<T> {
	List<T> create(){ return new ArrayList<T>(); }
	public static void main(String[] args) {
		ListMaker<String> stringMaker = new ListMaker<String>();
		List<String> stringList = stringMaker.create();
	}
}

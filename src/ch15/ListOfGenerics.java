/**
 * @Title ListOfGenerics.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName ListOfGenerics
 * @Description ��������
 * @author �����
 * @date 2019��3��26��
 * 
 */
public class ListOfGenerics<T> {
	private List<T> array = new ArrayList<T>();
	public void add(T item){ array.add(item); }
	public T get(int index){ return array.get(index); }
}

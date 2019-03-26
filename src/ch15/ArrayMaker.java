/**
 * @Title ArrayMaker.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * @version 1.0
 */
package ch15;
import java.lang.reflect.*;
import java.util.*;

/**
 * @ClassName ArrayMaker
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * 
 */
public class ArrayMaker<T> {
	private Class<T> kind;
	public ArrayMaker(Class<T> kind){ this.kind = kind; }
	@SuppressWarnings("unchecked")
	T[] create(int size){
		// �����д������飬ʹ��Array.newInstance()���Ƽ��ķ�ʽ
		return (T[])Array.newInstance(kind, size);
	}
	public static void main(String[] args) {
		ArrayMaker<String> stringMaker = new ArrayMaker<String>(String.class);
		String[] stringArray = stringMaker.create(9);
		System.out.println(Arrays.toString(stringArray));
	}
}

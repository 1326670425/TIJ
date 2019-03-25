/**
 * @Title GenericVarargs.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��25��
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName GenericVarargs
 * @Description ���ͷ����Ϳɱ�����б��ϡ�makeList()չʾ�����׼����е�java.util.Arrays.asList()��ͬ�Ĺ���
 * @author �����
 * @date 2019��3��25��
 * 
 */
public class GenericVarargs {
	public static <T> List<T> makeList(T... args){
		List<T> result = new ArrayList<T>();
		for(T item : args)
			result.add(item);
		return result;
	}
	public static void main(String[] args) {
		List<String> ls = makeList("A");
		System.out.println(ls);
		ls = makeList("A", "B", "C");
		System.out.println(ls);
		ls = makeList("ABCDEFG".split(""));
		System.out.println(ls);
	}
}

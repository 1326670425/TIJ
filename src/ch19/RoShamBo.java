/**
 * @Title RoShamBo.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch19;
import net.mindview.util.*;
/**
 * @ClassName RoShamBo
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * 
 */
public class RoShamBo {
	public static <T extends Competitor<T>> void match(T a, T b){
		System.out.println(a + " vs. " + b + ": " + a.compete(b));
	}
	// ��Ҫ��Enum<T>���ͣ���Ϊ����Enums.random()��ʹ��
	// ����ҪʱCompetitor<T>���ͣ���Ϊ�������ݸ�match()����
	public static <T extends Enum<T> & Competitor<T>> void play(Class<T> rsbClass, int size){
		for(int i = 0; i < size; i++)
			match(Enums.random(rsbClass), Enums.random(rsbClass));
	}
}

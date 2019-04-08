/**
 * @Title RoShamBo.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch19;
import net.mindview.util.*;
/**
 * @ClassName RoShamBo
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public class RoShamBo {
	public static <T extends Competitor<T>> void match(T a, T b){
		System.out.println(a + " vs. " + b + ": " + a.compete(b));
	}
	// 需要是Enum<T>类型，因为将在Enums.random()中使用
	// 又需要时Competitor<T>类型，因为将被传递给match()方法
	public static <T extends Enum<T> & Competitor<T>> void play(Class<T> rsbClass, int size){
		for(int i = 0; i < size; i++)
			match(Enums.random(rsbClass), Enums.random(rsbClass));
	}
}

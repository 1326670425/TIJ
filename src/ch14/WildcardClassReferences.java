/**
 * @Title WildcardClassReferences.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月24日
 * @version 1.0
 */
package ch14;

/**
 * @ClassName WildcardClassReferences
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月24日
 * 
 */
public class WildcardClassReferences {
	public static void main(String[] args) {
		Class<?> intClass = int.class;
		intClass = double.class;
	}
}

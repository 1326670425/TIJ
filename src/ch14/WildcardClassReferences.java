/**
 * @Title WildcardClassReferences.java
 * @Package ch14
 * @Description TODO
 * @author �����
 * @date 2019��2��24��
 * @version 1.0
 */
package ch14;

/**
 * @ClassName WildcardClassReferences
 * @Description TODO
 * @author �����
 * @date 2019��2��24��
 * 
 */
public class WildcardClassReferences {
	public static void main(String[] args) {
		Class<?> intClass = int.class;
		intClass = double.class;
	}
}

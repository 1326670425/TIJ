/**
 * @Title BoundedClassReferences.java
 * @Package ch14
 * @Description TODO
 * @author �����
 * @date 2019��2��24��
 * @version 1.0
 */
package ch14;

/**
 * @ClassName BoundedClassReferences
 * @Description TODO
 * @author �����
 * @date 2019��2��24��
 * 
 */
public class BoundedClassReferences {
	public static void main(String[] args) {
		Class<? extends Number> bounded = int.class;
		bounded = double.class;
		bounded = Number.class;
		
	}
}

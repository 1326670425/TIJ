/**
 * @Title BoundedClassReferences.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月24日
 * @version 1.0
 */
package ch14;

/**
 * @ClassName BoundedClassReferences
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月24日
 * 
 */
public class BoundedClassReferences {
	public static void main(String[] args) {
		Class<? extends Number> bounded = int.class;
		bounded = double.class;
		bounded = Number.class;
		
	}
}

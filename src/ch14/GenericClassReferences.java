/**
 * @Title GenericClassReferences.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月24日
 * @version 1.0
 */
package ch14;

/**
 * @ClassName GenericClassReferences
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月24日
 * 
 */
public class GenericClassReferences {
	public static void main(String[] args) {
		Class intClass = int.class;
		Class<Integer> genericIntClass = int.class;
		genericIntClass = Integer.class;
		intClass = double.class;
		//不合法的操作
		//genericIntClass = double.class;
	}
}

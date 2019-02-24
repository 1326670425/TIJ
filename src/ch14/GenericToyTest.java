/**
 * @Title GenericToyTest.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月24日
 * @version 1.0
 */
package ch14;

/**
 * @ClassName GenericToyTest
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月24日
 * 
 */
public class GenericToyTest {
	public static void main(String[] args) throws Exception{
		Class<FancyToy> ftClass = FancyToy.class;
		FancyToy fancyToy = ftClass.newInstance();
		Class<? super FancyToy> up = ftClass.getSuperclass();
		// 以下无法编译
		// Class<Toy> up2 = ftClass.getSuperclass();
		// 只能产生Object
		Object obj = up.newInstance();
	}
}

/**
 * @Title GenericToyTest.java
 * @Package ch14
 * @Description TODO
 * @author �����
 * @date 2019��2��24��
 * @version 1.0
 */
package ch14;

/**
 * @ClassName GenericToyTest
 * @Description TODO
 * @author �����
 * @date 2019��2��24��
 * 
 */
public class GenericToyTest {
	public static void main(String[] args) throws Exception{
		Class<FancyToy> ftClass = FancyToy.class;
		FancyToy fancyToy = ftClass.newInstance();
		Class<? super FancyToy> up = ftClass.getSuperclass();
		// �����޷�����
		// Class<Toy> up2 = ftClass.getSuperclass();
		// ֻ�ܲ���Object
		Object obj = up.newInstance();
	}
}

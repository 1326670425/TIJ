/**
 * @Title GenericClassReferences.java
 * @Package ch14
 * @Description TODO
 * @author �����
 * @date 2019��2��24��
 * @version 1.0
 */
package ch14;

/**
 * @ClassName GenericClassReferences
 * @Description TODO
 * @author �����
 * @date 2019��2��24��
 * 
 */
public class GenericClassReferences {
	public static void main(String[] args) {
		Class intClass = int.class;
		Class<Integer> genericIntClass = int.class;
		genericIntClass = Integer.class;
		intClass = double.class;
		//���Ϸ��Ĳ���
		//genericIntClass = double.class;
	}
}

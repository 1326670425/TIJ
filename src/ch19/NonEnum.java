/**
 * @Title NonEnum.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��7��
 * @version 1.0
 */
package ch19;

/**
 * @ClassName NonEnum
 * @Description ��ö�������getEnumConstants()
 * @author �����
 * @date 2019��4��7��
 * 
 */
public class NonEnum {
	public static void main(String[] args) {
		Class<Integer> intClass = Integer.class;
		try{
			//��ʱ�˷�������null�������쳣
			for(Object en : intClass.getEnumConstants())
				System.out.println(en);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

/**
 * @Title UpcastEnum.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��7��
 * @version 1.0
 */
package ch19;

enum Search{ HITHER, YON }

/**
 * @ClassName UpcastEnum
 * @Description ����values()�������ɱ��������뵽enum�еģ����������enumʵ������ת��ΪEnum����ôvalues()�Ͳ���ʹ���ˡ�
 * <p>��������Class���и�getEnumConstants()����������ͨ��Class����������enumʵ����
 * @author �����
 * @date 2019��4��7��
 * 
 */
public class UpcastEnum {
	public static void main(String[] args) {
		Search[] vals = Search.values();
		Enum e = Search.HITHER;
		// e.values(); // û�д˷���
		for(Enum en : e.getClass().getEnumConstants())
			System.out.println(en);
	}
}

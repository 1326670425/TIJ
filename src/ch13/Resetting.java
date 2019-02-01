/**
 * @Title Resetting.java
 * @Package ch13
 * @Description TODO
 * @author �����
 * @date 2019��2��1��
 * @version 1.0
 */
package ch13;
import java.util.regex.*;
/**
 * @ClassName Resetting
 * @Description reset()�������Խ����е�Matcher����Ӧ����һ���µ��ַ�����
 * <p>reset()����Ҳ����IO��ϣ�ÿ�μ���һ������
 * @author �����
 * @date 2019��2��1��
 * 
 */
public class Resetting {
	public static void main(String[] args) {
		Matcher m = Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
		while(m.find())
			System.out.print(m.group() + " ");
		System.out.println();
		m.reset("fix the rig with rags");
		while(m.find())
			System.out.print(m.group() + " ");
	}
}

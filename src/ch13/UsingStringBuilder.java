/**
 * @Title UsingStringBuilder.java
 * @Package ch13
 * @Description TODO
 * @author �����
 * @date 2019��1��14��
 * @version 1.0
 */
package ch13;
import java.util.*;
/**
 * @ClassName UsingStringBuilder
 * @Description Ԥ��ָ��StringBuilder���Ա��������·��仺�壬����Ч��
 * <p>��Ϊһ�����дtoString()����ʱ������ַ����Ƚϼ򵥣��������������������������յ��ַ��������
 * �����ѭ��֮�࣬��ô����Լ�������StringBuilder������������������ս��
 * @author �����
 * @date 2019��1��14��
 * 
 */
public class UsingStringBuilder {
	public static Random rand = new Random(47);
	public String toString(){
		StringBuilder result = new StringBuilder("[");
		for (int i = 0; i < 25; i++) {
			result.append(rand.nextInt(100));
			result.append(", ");
		}
		result.delete(result.length()-2, result.length());
		result.append("]");
		return result.toString();
	}
	public static void main(String[] args) {
		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);
	}
}

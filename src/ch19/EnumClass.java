/**
 * @Title EnumClass.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��4��
 * @version 1.0
 */
package ch19;
import static net.mindview.util.Print.*;

enum Shrubbery{ GROUND,  CRAWLING, HANGING }

/**
 * @ClassName EnumClass
 * @Description TODO
 * @author �����
 * @date 2019��4��4��
 * 
 */
public class EnumClass {
	public static void main(String[] args) {
		for(Shrubbery s : Shrubbery.values()){
			// ����enumʵ��������ʱ�Ĵ��򣬴�0��ʼ
			print(s + " ordinal: " + s.ordinal());
			printnb(s.compareTo(Shrubbery.CRAWLING) + " ");
			printnb(s.equals(Shrubbery.CRAWLING) + " ");
			// ����ʹ��==���Ƚ�enumʵ��
			print(s == Shrubbery.CRAWLING);
			print(s.getDeclaringClass());
			print(s.name());
			print("--------------------");
		}
		// ���ַ����в���ö������
		for(String s : "HANGING CRAWLING GROUND".split(" ")){
			// ���ݸ��������ַ��ض�Ӧ��enumʵ������������ڸ������ֵ�ʵ�����׳��쳣
			Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
			print(shrub);
		}
	}
}

/**
 * @Title ConstantSpecificMethod.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch19;
import java.util.*;
import java.text.*;
/**
 * @ClassName ConstantSpecificMethod
 * @Description Ϊenumʵ����д�������Ӷ�ʹ����Ծ��в�ͬ����Ϊ��ʵ�ַ���Ϊ��Ϊenum����һ������abstract������
 * Ȼ��Ϊÿ��enumʵ��ʵ�ָó��󷽷�
 * @author �����
 * @date 2019��4��8��
 * 
 */
public enum ConstantSpecificMethod {
	DATE_TIME{
		String getInfo(){
			return DateFormat.getDateInstance().format(new Date());
		}
	},
	CLASSPATH{
		String getInfo(){
			return System.getenv("CLASSPATH");
		}
	},
	VERSION{
		String getInfo(){
			return System.getProperty("java.version");
		}
	};
	abstract String getInfo();
	public static void main(String[] args) {
		for(ConstantSpecificMethod csm : values())
			System.out.println(csm.getInfo());
	}
	
}

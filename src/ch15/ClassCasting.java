/**
 * @Title ClassCasting.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * @version 1.0
 */
package ch15;
import java.io.*;
import java.util.*;
/**
 * @ClassName ClassCasting
 * @Description �µ�ת����ʽ��ͨ����������ת��
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class ClassCasting {
	@SuppressWarnings("unchecked")
	public void f(String[] args) throws Exception{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
		// �޷�����
		// List<Widget> lw1 = List<Widget>.class.cast(in.readObject());
		List<Widget> lw2 = List.class.cast(in.readObject());
	}
}

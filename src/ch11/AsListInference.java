/**
 * @Title AsListInference.java
 * @Package ch11
 * @Description TODO
 * @author �����
 * @date 2019��1��9��
 * @version 1.0
 */
package ch11;

import java.util.*;

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}

/**
 * @ClassName AsListInference
 * @Description Arrays.asList()������������������������List������������������ļ��裬����û��ע��������ḳ��ʲô�������͡�
 * @author �����
 * @date 2019��1��9��
 * 
 */
public class AsListInference {
	public static void main(String[] args) {
		List<Snow> snow1 = Arrays.asList(
				new Crusty(), new Slush(), new Powder());
		// �޷�����
		// List<Snow> snow2 = Arrays.asList(
		//		new Light(), new Heavy());
		// ����������ʾ��
		// found:java.util.List<Powder>
		// required:java.util.List<Snow>
		
		// Collections.addAll() doesn't get confused
		// Collections.addAll()����������������Ϊ���ӵ�һ���������˽⵽��Ŀ������
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		
		// Give a hint using an explicit type argument specification
		List<Snow> snow4 = Arrays.<Snow>asList(
				new Light(), new Heavy());
	}
}

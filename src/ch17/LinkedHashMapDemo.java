/**
 * @Title LinkedHashMapDemo.java
 * @Package ch17
 * @Description TODO
 * @author �����
 * @date 2019��3��31��
 * @version 1.0
 */
package ch17;
import java.util.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName LinkedHashMapDemo
 * @Description LinkedHashMapɢ�л�����Ԫ�أ�����ʱ����Ԫ�ز���˳����ʡ����ڹ��������趨LinkedHashMap�� ������װ�����ӣ����ʷ�ʽ��true������˳������false������˳�����򣩣���
 * ʹ֮���û��ڷ��ʵ��������ʹ���㷨�������ʴ�������
 * @author �����
 * @date 2019��3��31��
 * 
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {
	    LinkedHashMap<Integer,String> linkedMap =
	      new LinkedHashMap<Integer,String>(
	        new CountingMapData(9));
	    print(linkedMap);
	    // Least-recently-used order:
	    
	    linkedMap =
	      new LinkedHashMap<Integer,String>(16, 0.75f, true);
	    linkedMap.putAll(new CountingMapData(9));
	    print(linkedMap);
	    for(int i = 0; i < 6; i++) // Cause accesses:
	      linkedMap.get(i);
	    print(linkedMap);
	    linkedMap.get(0);
	    print(linkedMap);
	  }
}

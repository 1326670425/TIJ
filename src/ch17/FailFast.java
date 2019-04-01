/**
 * @Title FailFast.java
 * @Package ch17
 * @Description TODO
 * @author �����
 * @date 2019��4��1��
 * @version 1.0
 */
package ch17;
import java.util.*;
/**
 * @ClassName FailFast
 * @Description ���ٱ�����ƣ���ֹ����߳�ͬʱ�޸�ͬһ������������
 * <p>ConcurrentHashMap��CopyOnWriteArrayList��CopyOnWriteArraySet��ʹ���˿��Ա��������쳣�ļ���
 * @author �����
 * @date 2019��4��1��
 * 
 */
public class FailFast {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		Iterator<String> it = c.iterator();
		c.add("An object");
		try{
			String s = it.next();
		}catch(ConcurrentModificationException e){
			System.out.println(e);
		}
	}
}

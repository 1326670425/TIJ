/**
 * @Title AddingGroups.java
 * @Package ch11
 * @Description TODO
 * @author �����
 * @date 2019��1��9��
 * @version 1.0
 */
package ch11;

import java.util.*;

/**
 * @ClassName AddingGroups
 * @Description ���������һ��Ԫ��
 * @author �����
 * @date 2019��1��9��
 * 
 */
public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> collection = 
				new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Integer[] moreInts = {6, 7, 8, 9};
		collection.addAll(Arrays.asList(moreInts));
		// Runs significantly faster, but you can't construct a Collection this way
		// �����ٶ������ӿ죬�����㲻��ͨ�����ַ�ʽ������һ��Collection
		Collections.addAll(collection, 10, 11, 12, 13);
		Collections.addAll(collection, moreInts);
		
		List<Integer> list = Arrays.asList(14, 15, 16, 17);
		list.set(1, 99);
		// list.add(18);����ʱ������Ϊ�ײ������飬�޷��ı��С
	}
}

/**
 * @Title ArrayOfGenerics.java
 * @Package ch16
 * @Description TODO
 * @author �����
 * @date 2019��3��29��
 * @version 1.0
 */
package ch16;
import java.util.*;
/**
 * @ClassName ArrayOfGenerics
 * @Description ����������ʵ�����������飬���ǿ��Դ���������������á����Դ����Ƿ������飬Ȼ����ת��
 * @author �����
 * @date 2019��3��29��
 * 
 */
public class ArrayOfGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		List<String>[] ls;
		List[] la = new List[10];
		ls = (List<String>[])la; // "Unchecked" warning
		ls[0] = new ArrayList<String>();
		// �����ڴ���
		// ls[1] = new ArrayList<Integer>();
		
		Object[] objects = ls;
		objects[1] = new ArrayList<Integer>();
		
		//
		List<BerylliumSphere>[] spheres = (List<BerylliumSphere>[])new List[10];
		for(int i = 0; i < spheres.length; i++)
			spheres[i] = new ArrayList<BerylliumSphere>();
		
	}
}

/**
 * @Title ListIteration.java
 * @Package ch11
 * @Description TODO
 * @author �����
 * @date 2019��1��9��
 * @version 1.0
 */
package ch11;
import ch14.pets.*;
import java.util.*;
/**
 * @ClassName ListIteration
 * @Description ListIterator:��ǿ��ĵ�������ֻ������List��ķ��ʣ�����˫���ƶ��������Բ�������ڵ�ǰλ�õ�ǰ������̵�������
 * ����ʹ��set()�����滻�����ʹ������һ��Ԫ�ء�����ͨ������listIterator()��������һ��ָ��List��ʼ����ListIterator�����һ�����
 * ͨ������listIterator(n)��������һ��һ��ʼ��ָ���б�����Ϊn��Ԫ�ش���ListIterator��
 * @author �����
 * @date 2019��1��9��
 * 
 */
public class ListIteration {
	public static void main(String[] args) {
		List<Pet> pets = Pets.arrayList(8);
		ListIterator<Pet> it = pets.listIterator();
		while(it.hasNext()){
			System.out.println(it.next() + ", " + it.nextIndex() + 
					", " + it.previousIndex() + "; ");
		}
		System.out.println();
		while(it.hasPrevious()){
			System.out.println(it.previous().id() + " ");
		}
		System.out.println();
		System.out.println(pets);
		it = pets.listIterator(3);
		while(it.hasNext()){
			it.next();
			it.set(Pets.randomPet());
		}
		System.out.println(pets);
	}
}

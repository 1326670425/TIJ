/**
 * @Title InfiniteRecursion.java
 * @Package ch13
 * @Description TODO
 * @author �����
 * @date 2019��1��20��
 * @version 1.0
 */
package ch13;
import java.util.*;
/**
 * @ClassName InfiniteRecursion
 * @Description ��ӡ�����ڴ��ַ
 * @author �����
 * @date 2019��1��20��
 * 
 */
public class InfiniteRecursion {
	public String toString(){
		/*
		 * ���﷢�����Զ�����ת������Ϊ����������String�������˸�"+"�����ٺ�ߵĶ�����String�����Ǳ����������Ž�thisת��Ϊһ��String
		 * ��ͨ������this��toString()���������Ƿ����˵ݹ���á�
		 * ������ӡ������ڴ��ַ����ôӦ�õ���Object.toString()��������super.toString()
		 */
		//return " InfiniteRecursion address: " + this + "\n";
		return " InfiniteRecursion address: " + super.toString() + "\n";
	}
	public static void main(String[] args) {
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		for (int i = 0; i < 10; i++) {
			v.add(new InfiniteRecursion());
		}
		System.out.println(v);
	}
}

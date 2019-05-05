/**
 * @Title CurryingAndPartials.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import java.util.function.*;

/**
 * @ClassName CurryingAndPartials
 * @Description ���ﻯ(Currying)�Ͳ�����ֵ
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class CurryingAndPartials {
	// δ���ﻯ
	static String uncurried(String a, String b) {
		return a + b;
	}
	public static void main(String[] args) {
		// ���ﻯ�ĺ���
		Function<String, Function<String, String>> sum = 
				a -> b -> a + b;
		System.out.println(uncurried("Hi ", "Ho"));
		
		// ���ﻯ��Ŀ�����ܹ�ͨ���ṩһ������������һ���º�����������������һ�����κ�����ʣ�µ�
		// �޲κ�����ʵ���ϣ����ܴ�һ��˫����������ʼ�����õ�һ������������
		Function<String, String> hi = sum.apply("Hi ");
		System.out.println(hi.apply("Ho"));
		
		// ����Ӧ��
		Function<String, String> sumHi = sum.apply("Hup ");
		System.out.println(sumHi.apply("Ho"));
		System.out.println(sumHi.apply("Hey"));
	}
}

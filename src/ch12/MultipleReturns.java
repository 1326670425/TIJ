/**
 * @Title MultipleReturns.java
 * @Package ch12
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * @version 1.0
 */
package ch12;

/**
 * @ClassName MultipleReturns
 * @Description finally���ǻ�ִ�У�������һ�������п��ԴӶ���㷵�أ����ҿ��Ա�֤��Ҫ����������Ȼ�����
 * @author �����
 * @date 2019��1��10��
 * 
 */
public class MultipleReturns {
	public static void f(int i){
		System.out.println("Initialization that requires cleanup");
		try{
			System.out.println("Point 1");
			if(i == 1) return;
			System.out.println("Point 2");
			if(i == 2) return;
			System.out.println("Point 3");
			if(i == 3) return;
			System.out.println("End");
			return;
		}finally{
			System.out.println("Performing cleanup");
		}
	}
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			f(i);
		}
	}
}

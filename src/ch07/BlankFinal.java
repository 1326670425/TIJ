/**
 * @Title BlankFinal.java
 * @Package ch07
 * @Description TODO
 * @author �����
 * @date 2019��1��4��
 * @version 1.0
 */
package ch07;

/**
 * @ClassName BlankFinal
 * @Description �հ�final��һ�����е�final������������ݶ����������ͬ��ȴ�ֱ�����㶨���������
 * @author �����
 * @date 2019��1��4��
 * 
 */
class Poppet{
	private int i;
	Poppet(int ii){
		i = ii;
		System.out.println("���ػ���");
	}
}
public class BlankFinal {
	private final int i = 0;
	private final int j;
	private final Poppet p;
	//�հ�final�����ڶ��崦���߹��캯���г�ʼ��
	public BlankFinal(){
		j = 1;
		p = new Poppet(2);
		System.out.println("�޲ι��캯��");
	}
	public BlankFinal(int x){
		j = x;
		p = new Poppet(x);
		System.out.println("�вι��캯��");
	}
	public static void main(String[] args){
		new BlankFinal();
		new BlankFinal(1);
	}
}

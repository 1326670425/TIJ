/**
 * @Title ResponsiveUI.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;

class UnresponsiveUI{
	private volatile double d = 1;
	public UnresponsiveUI() throws Exception{
		while(d > 0)
			d = d + (Math.PI + Math.E) / d;
		System.in.read();
	}
}

/**
 * @ClassName ResponsiveUI
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class ResponsiveUI extends Thread{
	private static volatile double d = 1;
	public ResponsiveUI(){
		setDaemon(true);
		start();
	}
	public void run(){
		while(true)
			d = d + (Math.PI + Math.E) / d;
	}
	
	public static void main(String[] args) throws Exception{
		// ����������ƭ�ˣ���Ϊ�����ܹ������ȡ����̨�������һ�С������������ѭ��
		// new UnresponsiveUI();
		new ResponsiveUI();
		// ResponsiveUI��run������������һ���߳��У����Բ���Ӱ�����̻߳�ȡ����̨����
		System.in.read();
		System.out.println(d);
	}
}

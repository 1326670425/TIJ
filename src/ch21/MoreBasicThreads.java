/**
 * @Title MoreBasicThreads.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;

/**
 * @ClassName MoreBasicThreads
 * @Description ��һ�̣߳�main()���ڴ������е�LiftOff�̣߳�����id��Ψһ���������̴߳���LiftOff�̣߳�
 * �����ֶ���߳�ӵ����ͬ��id�ŵ����
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class MoreBasicThreads {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++)
			new Thread(new LiftOff()).start();
		System.out.println("Waiting for LiftOff");
	}
}

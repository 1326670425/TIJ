/**
 * @Title RunnableMethodReference.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

class Go {
	static void go() {
		System.out.println("Go::go()");
	}
}

/**
 * @ClassName RunnableMethodReference
 * @Description Lambda���ʽ�ͷ���������ΪRunnable
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class RunnableMethodReference {
	public static void main(String[] args) {
		// �����ڲ��෽ʽ
		new Thread(new Runnable(){
			public void run(){
				System.out.println("Annoymous");
			}
		}).start();
		
		// Lambda���ʽ��ʽ
		new Thread(
			() -> System.out.println("lambda")	
		).start();
		
		// ��������
		new Thread(Go::go).start();
	}
}

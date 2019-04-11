/**
 * @Title SyncObject.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��11��
 * @version 1.0
 */
package ch21;
import static net.mindview.util.Print.*;

class DualSynch{
	private Object syncObject = new Object();
	// ͬ��������������this��ͬ��
	public synchronized void f(){
		for(int i = 0; i < 5; i++){
			print("f()");
			Thread.yield();
		}
	}
	// ��syncObject��ͬ��
	public void g(){
		synchronized (syncObject) {
			for(int i = 0; i < 5; i++){
				print("g()");
				Thread.yield();
			}
		}
	}
}

/**
 * @ClassName SyncObject
 * @Description ������������ʵ��ͬ��
 * @author �����
 * @date 2019��4��11��
 * 
 */
public class SyncObject {
	public static void main(String[] args) {
		final DualSynch ds = new DualSynch();
		new Thread(){
			public void run(){
				ds.f();
			}
		}.start();
		ds.g();
	}
}

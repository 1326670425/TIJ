/**
 * @Title SyncObject.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月11日
 * @version 1.0
 */
package ch21;
import static net.mindview.util.Print.*;

class DualSynch{
	private Object syncObject = new Object();
	// 同步整个方法，在this上同步
	public synchronized void f(){
		for(int i = 0; i < 5; i++){
			print("f()");
			Thread.yield();
		}
	}
	// 在syncObject上同步
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
 * @Description 在其他对象上实现同步
 * @author 吴扬颉
 * @date 2019年4月11日
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

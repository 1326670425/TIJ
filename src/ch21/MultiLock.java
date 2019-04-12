/**
 * @Title MultiLock.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��11��
 * @version 1.0
 */
package ch21;
import static net.mindview.util.Print.*;
/**
 * @ClassName MultiLock
 * @Description һ�������λ��ͬһ������
 * @author �����
 * @date 2019��4��11��
 * 
 */
public class MultiLock {
	public synchronized void f1(int count){
		if(count-- > 0){
			print("f1() calling f2() with count " + count);
			f2(count);
		}
	}
	public synchronized void f2(int count){
		if(count-- > 0){
			print("f2() calling f1() with count " + count);
			f1(count);
		}
	}
	public static void main(String[] args) {
		final MultiLock multiLock = new MultiLock();
		new Thread(){
			public void run(){
				multiLock.f1(10);
			}
		}.start();
	}
}
